package com.byalif.quizservice.client;


//@CircuitBreaker(name = "external", fallbackMethod = "fallback")
//@FeignClient(name ="QUESTIONS-SERVICE")
//public interface QuizInterface {
//
//	@GetMapping("/question/getRand/{category}/{limit}")
//    Question[] fetchQuestions(@PathVariable("category") String category, @PathVariable("limit") int limit);
//    
//    default void fallback() throws Exception {
//        throw new Exception("Question service down.");
//    }
//}