package com.example.demo.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private final SortAlgorithm sortAlgorithm;

	@Autowired
	public BinarySearchImpl(@Qualifier("bubble") SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
				
		// Bubble sort algorithm
		return 3;
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("Post construct");
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("Pre destroy");
	}
}
