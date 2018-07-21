package com.vechicle.inventory.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vechicle.inventory.model.VehicleDTO;

public class VehicleRowMapper implements RowMapper<VehicleDTO> {
	
	    @Override
	    public VehicleDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	VehicleDTO vechile = new VehicleDTO();
	    	
	    	vechile.setVin(rs.getInt("VIN"));
	    	vechile.setVechicleType(rs.getString("VEHICLETYPE"));
	    	vechile.setModel(rs.getString("MODEL"));
	    	vechile.setMilege(rs.getInt("MILEGE"));
	    	vechile.setMakeYear(rs.getInt("MAKEYEAR"));
	    	vechile.setNumberOfSeats(rs.getInt("SEATS"));
	    	vechile.setLoadCapacity(rs.getInt("LOADCAPACITY"));
	    	
	        return vechile;
	    }
	}


