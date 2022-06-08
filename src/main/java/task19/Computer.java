package task19;

import java.util.Objects;

public class Computer {

    private String processor;
    private int RAM_memory;
    private String graphicCard;
    private String company;
    private String model;

    public Computer(String processor, int RAM_memory, String graphicCard, String company, String model) {
        this.processor = processor;
        this.RAM_memory = RAM_memory;
        this.graphicCard = graphicCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRAM_memory() {
        return RAM_memory;
    }

    public void setRAM_memory(int RAM_memory) {
        this.RAM_memory = RAM_memory;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", RAM_memory=" + RAM_memory +
                ", graphicCard='" + graphicCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '\'' + ", ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return RAM_memory == computer.RAM_memory && Objects.equals(processor, computer.processor) && Objects.equals(graphicCard, computer.graphicCard) && Objects.equals(company, computer.company) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, RAM_memory, graphicCard, company, model);
    }
}
