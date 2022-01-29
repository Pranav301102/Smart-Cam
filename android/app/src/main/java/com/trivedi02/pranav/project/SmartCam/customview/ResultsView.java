

package com.trivedi02.pranav.project.SmartCam.customview;

import java.util.List;
import com.trivedi02.pranav.project.SmartCam.tflite.Detector.Recognition;

public interface ResultsView {
  public void setResults(final List<Recognition> results);
}
