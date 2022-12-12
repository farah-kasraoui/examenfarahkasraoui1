package tn.esprit.kasraouifarah1.Service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ServiceZone implements IServicezone{
    @Scheduled
    @Override
    public void getNbrGardesBYZone() {

    }
}
