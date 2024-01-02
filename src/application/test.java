package application;
	
import java.sql.Timestamp;
import java.util.ArrayList;

import DAO.ActivityDAO;
import DAO.DeviceActivityDAO;
import DAO.DeviceDAO;
import DAO.RentDAO;
import DAO.WorkDAO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Activity;
import model.Device;
import model.DeviceActivity;
import model.Rent;
import model.Work;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class test{
	public static void main(String[] args) {
		System.out.println(ActivityDAO.getInstance().checkRoomFree(1, Timestamp.valueOf("2024-01-01 09:45:10"), Timestamp.valueOf("2024-01-01 09:45:10")));
		}
	}
	
