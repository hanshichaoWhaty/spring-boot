package com.whaty.sample.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by hsc on 16/8/16.
 */
@Entity
@Table(name = "pr_stu_score")
public class Score implements Serializable {

    private static final long serialVersionUID = -8805654196766023958L;

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, name = "stuId")
    private int stuId;

    @Column(nullable = false, name = "subjectName")
    private String subjectName;

    @Column(name = "score")
    private double score;

    @Column(nullable = false, name = "examTime")
    private Date examTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getExamTime() {
        return examTime;
    }

    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }
}
