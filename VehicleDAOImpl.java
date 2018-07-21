package com.vechicle.inventory.DAO;

import java.sql.Types;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vechicle.inventory.model.VehicleDTO;

@Repository
public class VehicleDAOImpl implements VehicleDAO{

	@Autowired
	DataSource dataSource;

	private JdbcTemplate jdbcTemplate;
	
	private static final String ALL_VEHICLE_QUERY ="SELECT * FROM VEHICLE";
	private static final String SAVE_VEHICLE_QUERY ="INSERT INTO VEHICLE VALUES (?,?,?,?,?,?,?)";
	private static final String UPDATE_VEHICLE_QUERY ="UPDATE VEHICLE SET MILEGE= ? WHERE VIN = ? ";
	private static final String DELETE_VEHICLE_QUERY ="DELETE VEHICLE WHERE VIN = (SELECT MAX(VIN) FROM VEHICLE) ";

	@PostConstruct
	private void postConstruct() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<VehicleDTO> getAllVehiclesDetails() {
		
		return jdbcTemplate.query(ALL_VEHICLE_QUERY, new VehicleRowMapper());
	}


	@Override
	public void addVehicle(VehicleDTO vehicleDetails) {
		
		Random rand = new Random();
		int  vin = rand.nextInt(50) + 1;
		
		Object[] params = new Object[] { vin, vehicleDetails.getVechicleType(), vehicleDetails.getModel(),vehicleDetails.getMilege(),
				vehicleDetails.getMakeYear(),vehicleDetails.getNumberOfSeats(),vehicleDetails.getLoadCapacity() };
		
		int[] types = new int[] { Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.INTEGER,Types.INTEGER,Types.INTEGER,Types.INTEGER };
		
		int count = jdbcTemplate.update(SAVE_VEHICLE_QUERY,params,types);
		
		
	}

	@Override
	public void updateVehicleDetails(int vehicleMilege , int vin) {
		
	Object[] params = new Object[] { vehicleMilege, vin};
		
		int[] types = new int[] { Types.INTEGER, Types.INTEGER };
		
		int count = jdbcTemplate.update(UPDATE_VEHICLE_QUERY,params,types);
		
	}
	
	
	@Override
	public void deleteLatestVehicle() {
		
		int count = jdbcTemplate.update(DELETE_VEHICLE_QUERY);
	}
	
		
	    		

	

}
