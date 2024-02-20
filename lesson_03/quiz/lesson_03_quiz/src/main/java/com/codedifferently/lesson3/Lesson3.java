package com.codedifferently.lesson3;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class Lesson3 implements CommandLineRunner {

  public static void main(String[] args) {
    var application = new SpringApplication(Lesson3.class);
    application.run(args);
  }

  public void run(String... args) {
    List<QuizQuestion> quizQuestions = makeQuizQuestions();
    Objects.requireNonNull(quizQuestions);
    var printer = new QuizPrinter();
    printer.printQuiz(quizQuestions);
  }

  public static List<QuizQuestion> makeQuizQuestions() {
    return List.of(
        makeQuestion0(),
        makeQuestion1(),
        makeQuestion2(),
        makeQuestion3(),
        makeQuestion4(),
        makeQuestion5(),
        makeQuestion6(),
        makeQuestion7(),
        makeQuestion8());
  }

  private static QuizQuestion makeQuestion0() {
    return new MultipleChoiceQuizQuestion(
        0,
        "If your computer doesn't turn on, what is the first thing you should check?",
        Map.of(
            AnswerChoice.A, "The power supply",
            AnswerChoice.B, "The monitor",
            AnswerChoice.C, "The keyboard",
            AnswerChoice.D, "The mouse"),
        AnswerChoice.UNANSWERED); // Replace `UNANSWERED` with the correct answer
  }

  private static QuizQuestion makeQuestion1() {
    return new MultipleChoiceQuizQuestion(
        1,
        "Which part of the computer is responsible for processing data?",
        Map.of(
            AnswerChoice.A, "The power supply",
            AnswerChoice.B, "The keyboard",
            AnswerChoice.C, "The CPU",
            AnswerChoice.D, "RAM"),
        AnswerChoice.UNANSWERED); // Replace `UNANSWERED` with the correct answer
  }

  private static QuizQuestion makeQuestion2() {
    return new MultipleChoiceQuizQuestion(
        2,
        "This part of the computer is like the CPU, but handles graphics computations.",
        Map.of(
            AnswerChoice.A, "The monitor",
            AnswerChoice.B, "The GPU",
            AnswerChoice.C, "RAM",
            AnswerChoice.D, "The motherboard"),
        AnswerChoice.UNANSWERED); // Replace `UNANSWERED` with the correct answer
  }

  private static QuizQuestion makeQuestion3() {
    return new MultipleChoiceQuizQuestion(
        3,
        "The CPU uses what part of the computer to store and execute instructions?",
        Map.of(
            AnswerChoice.A, "The power supply",
            AnswerChoice.B, "The keyboard",
            AnswerChoice.C, "RAM",
            AnswerChoice.D, "The GPU"),
        AnswerChoice.UNANSWERED); // Replace `UNANSWERED` with the correct answer
  }

  private static QuizQuestion makeQuestion4() {
    return new MultipleChoiceQuizQuestion(
        4,
        "What components are hard drives and solid state drives (SSD) classified as?",
        Map.of(
            AnswerChoice.A, "Motherboards",
            AnswerChoice.B, "Storage devices",
            AnswerChoice.C, "RAM",
            AnswerChoice.D, "CPU"),
        AnswerChoice.UNANSWERED); // Replace `UNANSWERED` with the correct answer
  }

  private static QuizQuestion makeQuestion5() {
    return new MultipleChoiceQuizQuestion(
        5,
        "This part of the computer is like the human body's central nervous system:",
        Map.of(
            AnswerChoice.A, "Motherboard",
            AnswerChoice.B, "Storage",
            AnswerChoice.C, "RAM",
            AnswerChoice.D, "CPU"),
        AnswerChoice.UNANSWERED); // Replace `UNANSWERED` with the correct answer
  }

  private static QuizQuestion makeQuestion6() {
    return new QuizQuestion(
        6,
        "What is the decimal number 34 in binary?",
        "0b00000000"); // Replace the correct digits in the answer
  }

  private static QuizQuestion makeQuestion7() {
    return new QuizQuestion(
        7,
        "What is the decimal number 34 in hex?",
        "0x00"); // Replace the correct digits in the answer
  }

  private static QuizQuestion makeQuestion8() {
    return new QuizQuestion(
        8,
        "What is binary number 0b01100101 in decimal?",
        "0"); // Replace the correct digits in the answer
  }
}
