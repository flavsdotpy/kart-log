package com.ap3x.kartlog.service;

import com.ap3x.kartlog.model.LapLog;
import com.ap3x.kartlog.model.RacerResult;

import java.util.List;

public interface PrintService {

    void printGrid(List<RacerResult> grid);

    void printBestLaps(List<LapLog> bestLaps);

}
