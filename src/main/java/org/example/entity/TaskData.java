package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks,
                    Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        switch (name) {
            case ("ann"):
                return this.annsTasks;
            case ("bob"):
                return this.bobsTasks;
            case ("carol"):
                return this.carolsTasks;
            case ("all"):
                return getUnion(this.unassignedTasks,this.annsTasks,
                                this.bobsTasks,this.carolsTasks);
            default:
                return null;
        }

    }

    public Set<Task> getUnion(Set<Task> ...sets){
        Set<Task> unionTasks = new HashSet<>();

        for (Set<Task> set: sets){
            unionTasks.addAll(set);
        }
        return unionTasks;
    }

    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2){
        Set<Task> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2){
        Set<Task> differences = new HashSet<>(set1);
        differences.removeAll(set2);
        return differences;
    }

}
