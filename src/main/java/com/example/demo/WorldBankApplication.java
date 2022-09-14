package com.example.demo;

import com.example.demo.domain.Project;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

@Slf4j
@SpringBootApplication
public class WorldBankApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WorldBankApplication.class, args);
	}

	@Override
	public void run(String[] args) throws IOException {
		final String WORLD_BANK = "classpath:world_bank.json";

		List<Project> rootList = parseJsonToArray(WORLD_BANK);
		calculateNoProjectsAndTotalCostsPerRegion(rootList);
	}

	private List<Project> parseJsonToArray(String path) throws FileNotFoundException {
		ObjectMapper objectMapper = new ObjectMapper();
		File jsonFile = ResourceUtils.getFile(path);

		List<Project> rootList = new ArrayList<>();
		try(BufferedReader fileReader = new BufferedReader(new FileReader(jsonFile))) {
			String line = fileReader.readLine();
			while (line != null) {
				rootList.add(objectMapper.readValue(fileReader.readLine(), Project.class));
			}
		} catch (IllegalArgumentException | IOException e) {
			e.printStackTrace();
		}
		return rootList;
	}

	private void calculateNoProjectsAndTotalCostsPerRegion(List<Project> rootList) {
		long noProjectsInMENA = rootList.stream()
				.filter(e -> e.getRegionname().equals("Middle East and North Africa"))
				.count();

		long costProjectsInMENA = rootList.stream()
				.filter(e -> e.getRegionname().equals("Middle East and North Africa"))
				.mapToLong(Project::getLendprojectcost)
				.sum();


		long noProjectsInEAP = rootList.stream()
				.filter(e -> e.getRegionname().equals("East Asia and Pacific"))
				.count();

		long costProjectsInEAP = rootList.stream()
				.filter(e -> e.getRegionname().equals("East Asia and Pacific"))
				.mapToLong(Project::getLendprojectcost)
				.sum();

		long noProjectsInA = rootList.stream()
				.filter(e -> e.getRegionname().equals("Africa"))
				.count();

		long costProjectsInA = rootList.stream()
				.filter(e -> e.getRegionname().equals("Africa"))
				.mapToLong(Project::getLendprojectcost)
				.sum();


		long noProjectsInSA = rootList.stream()
				.filter(e -> e.getRegionname().equals("South Asia"))
				.count();

		long costProjectsInSA = rootList.stream()
				.filter(e -> e.getRegionname().equals("South Asia"))
				.mapToLong(Project::getLendprojectcost)
				.sum();


		long noProjectsInECA = rootList.stream()
				.filter(e -> e.getRegionname().equals("Europe and Central Asia"))
				.count();

		long costProjectsInECA = rootList.stream()
				.filter(e -> e.getRegionname().equals("Europe and Central Asia"))
				.mapToLong(Project::getLendprojectcost)
				.sum();


		long noProjectsInLAC = rootList.stream()
				.filter(e -> e.getRegionname().equals("Latin America and Caribbean"))
				.count();

		long costProjectsInLAC = rootList.stream()
				.filter(e -> e.getRegionname().equals("Latin America and Caribbean"))
				.mapToLong(Project::getLendprojectcost)
				.sum();


		long noProjectsInOtherRegions = rootList.stream()
				.filter(e -> e.getRegionname().equals("Other"))
				.count();

		long costProjectsInOtherRegions = rootList.stream()
				.filter(e -> e.getRegionname().equals("Other"))
				.mapToLong(Project::getLendprojectcost)
				.sum();

		log.info("Middle East and North noProjectsInA: " + noProjectsInMENA + " and totalcost : "+costProjectsInMENA+
				"\nEast Asia and Pacific: " + noProjectsInEAP+ " and totalcost : "+costProjectsInEAP+
				"\nnoProjectsInA: "+ noProjectsInA+ " and totalcost : "+costProjectsInA+
				"\nSouth Asia: "+ noProjectsInSA+ " and totalcost : "+costProjectsInSA+
				"\nEurope and Central Asia: "+ noProjectsInECA+ " and totalcost : "+costProjectsInECA+
				"\nLatin America and Caribbean: "+ noProjectsInLAC+ " and totalcost : "+costProjectsInLAC+
				"\nnoProjectsInOtherRegions: "+ noProjectsInOtherRegions+ " and totalcost : "+costProjectsInOtherRegions
		);
	}

	public static <T> Predicate<T> distinctByKey(
			Function<? super T, ?> keyExtractor) {

		Map<Object, Boolean> seen = new ConcurrentHashMap<>();
		return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
}
