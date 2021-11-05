package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.List;

@Entity
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String question;
    private String firstOption;
    private String secondOption;
    private String thirdOption;
    private String firthOption;
    private String fifthOption;
    private String firstComparison;
    private String secondComparison;
    private String thirdComparison;
    private String firthComparison;
    private String fifthComparison;
    private String firstAnswer;
    private String secondAnswer;
    private String thirdAnswer;
    private String fourAnswer;
    private String fiveAnswer;
    public int score;

    private String delimiter;

    @Transient
    private MultipartFile bookImage;

    @OneToMany(mappedBy = "test")
    @JsonIgnore
    private List<BookToCartItem> bookToCartItemList;

    private boolean active = true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getFirstOption() {
        return firstOption;
    }

    public void setFirstOption(String firstOption) {
        this.firstOption = firstOption;
    }

    public String getSecondOption() {
        return secondOption;
    }

    public void setSecondOption(String secondOption) {
        this.secondOption = secondOption;
    }

    public String getThirdOption() {
        return thirdOption;
    }

    public void setThirdOption(String thirdOption) {
        this.thirdOption = thirdOption;
    }

    public String getFirthOption() {
        return firthOption;
    }

    public void setFirthOption(String firthOption) {
        this.firthOption = firthOption;
    }

    public String getFifthOption() {
        return fifthOption;
    }

    public void setFifthOption(String fifthOption) {
        this.fifthOption = fifthOption;
    }

    public String getFirstComparison() {
        return firstComparison;
    }

    public void setFirstComparison(String firstComparison) {
        this.firstComparison = firstComparison;
    }

    public String getSecondComparison() {
        return secondComparison;
    }

    public void setSecondComparison(String secondComparison) {
        this.secondComparison = secondComparison;
    }

    public String getThirdComparison() {
        return thirdComparison;
    }

    public void setThirdComparison(String thirdComparison) {
        this.thirdComparison = thirdComparison;
    }

    public String getFirthComparison() {
        return firthComparison;
    }

    public void setFirthComparison(String firthComparison) {
        this.firthComparison = firthComparison;
    }

    public String getFifthComparison() {
        return fifthComparison;
    }

    public void setFifthComparison(String fifthComparison) {
        this.fifthComparison = fifthComparison;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public void setFirstAnswer(String firstAnswer) {
        this.firstAnswer = firstAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public void setSecondAnswer(String secondAnswer) {
        this.secondAnswer = secondAnswer;
    }

    public String getThirdAnswer() {
        return thirdAnswer;
    }

    public void setThirdAnswer(String thirdAnswer) {
        this.thirdAnswer = thirdAnswer;
    }

    public String getFourAnswer() {
        return fourAnswer;
    }

    public void setFourAnswer(String fourAnswer) {
        this.fourAnswer = fourAnswer;
    }

    public String getFiveAnswer() {
        return fiveAnswer;
    }

    public void setFiveAnswer(String fiveAnswer) {
        this.fiveAnswer = fiveAnswer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public MultipartFile getBookImage() {
        return bookImage;
    }

    public void setBookImage(MultipartFile bookImage) {
        this.bookImage = bookImage;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<BookToCartItem> getBookToCartItemList() {
        return bookToCartItemList;
    }

    public void setBookToCartItemList(List<BookToCartItem> bookToCartItemList) {
        this.bookToCartItemList = bookToCartItemList;
    }
}