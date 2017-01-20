package pl.edu.icm.pmf.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.info.rkluszczynski.pmf.core.GridField;

@Service
class SimulationService {
    private final GridField gridField;

    @Autowired
    SimulationService(GridField gridField) {
        this.gridField = gridField;
    }

    void execute(String[] args) {
        System.out.println(gridField);
    }
}
