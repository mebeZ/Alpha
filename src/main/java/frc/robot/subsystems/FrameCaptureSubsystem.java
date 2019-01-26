public class FrameCapture extends Subsystem {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME); // Placeholder for API used to connect to server
        VideoCapture cap = new VideoCapture(1); // Placeholder for IP address
        flag, frame = cap.retrieve();
        cap.imshow('video', frame);
    }
    
}