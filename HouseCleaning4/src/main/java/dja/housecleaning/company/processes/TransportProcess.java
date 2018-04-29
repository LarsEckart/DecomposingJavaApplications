package dja.housecleaning.company.processes;

import java.util.List;

import dja.housecleaning.company.HouseCleaning;
import dja.housecleaning.company.jobpositions.Cleaner;
import other.things.CleaningSupply;
import other.things.CleaningTool;
import other.things.Van;

public class TransportProcess {

	Van companyVan;

	public TransportProcess() {
		companyVan = HouseCleaning.COMPANY.getCompanyVan();
	}

	public void goTo(String address, Cleaner cleaner, List<CleaningSupply> supplies, List<CleaningTool> tools) {
		companyVan.load(supplies);
		companyVan.load(tools);
		companyVan.addPassenger(cleaner);
		companyVan.drive(address);
	}


}