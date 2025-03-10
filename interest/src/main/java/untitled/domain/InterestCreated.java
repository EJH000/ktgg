package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InterestCreated extends AbstractEvent {

    private Long id;
    private String projectname;
    private Date date;
    private String phone;
    private String customername;
    private String matchedsalesman;
    private Boolean interest;

    public InterestCreated(Interest aggregate) {
        super(aggregate);
    }

    public InterestCreated() {
        super();
    }
}
//>>> DDD / Domain Event
