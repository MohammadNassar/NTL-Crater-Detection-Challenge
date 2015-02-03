package gov.nasa.CraterDetection.Detect;

public class Detector {
	
	private boolean detectedCrater;
	private double detectionConfidence;
	
	public Detector() {
		
	}
	
	public boolean isCraterDetected() {
		
		return detectedCrater;
	}
	
	public void setDetectedCrater(boolean detected) {
		
		detectedCrater = detected;
	}
	
	public void setDetectionConfidence(double confidence) {
		
		detectionConfidence = confidence;
	}
	
	public double getDetectionConfidence() {
		
		return detectionConfidence;
	}
}
