package pl.speedster.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.speedster.model.Investment;
import pl.speedster.repository.InvestmentRepository;

import java.util.List;

@RestController
@RequestMapping("/investments")
public class InvestmentController {
    private final InvestmentRepository investmentRepository;

    public InvestmentController(InvestmentRepository investmentRepository) {
        this.investmentRepository = investmentRepository;
    }

    @GetMapping("/{userId")
    public ResponseEntity<List<Investment>> getInvestment(@PathVariable("userId") int userId) {
        return ResponseEntity.ok(investmentRepository.findbyUserId(userId));
    }
}
