package com.tcs.investment.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tcs.investment.model.Transactions;
import com.tcs.investment.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	TransactionService service;
	
	@GetMapping("/fetch")
	public List<Transactions> getTransaction() {
		return service.getTransactions();
	}
	
    @GetMapping("/transactionsid/{id}")
	public Transactions fetchTransactions(@PathVariable int id) {
		return service.getTransactionById(id);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/addtransactions")
	public ResponseEntity<Transactions> createTransactions(@RequestBody Transactions transactions ) throws Exception{

		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(transactions));

	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/updatetransactions")
	public Transactions updateInvestors(@RequestBody Transactions transactions) throws Exception {
		return service.update(transactions);
	}

	@DeleteMapping("/transactionsid/{id}")
	public boolean deletetransactions(@PathVariable int id) {
		return service.deleteForTransaction(id);
	}



}
