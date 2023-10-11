package Invoice;

public class Invoice {
    private String deviceModel;
    private String deviceDescription;
    private int deviceQuantities;
    private double devicePrice;

    public Invoice(String deviceModel, String deviceDescription, int deviceQuantities, double devicePrice) {
        this.deviceModel = deviceModel;
        this.deviceDescription = deviceDescription;
        if (deviceQuantities < 0) {
            this.deviceQuantities = 0;
        } else if (devicePrice < 0) {
            this.devicePrice = 0;
        } else {
            this.deviceQuantities = deviceQuantities;
            this.devicePrice = devicePrice;
        }
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceDescription() {
        return deviceDescription;
    }

    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    public int getDeviceQuantities() {
        return deviceQuantities;
    }

    public void setDeviceQuantities(int deviceQuantities) {
        if (deviceQuantities < 0) {
            this.deviceQuantities = 0;
        } else {
            this.deviceQuantities = deviceQuantities;
        }
    }

    public double getDevicePrice() {
        return devicePrice;
    }

    public void setDevicePrice(double devicePrice) {
        if (devicePrice < 0) {
            this.devicePrice = 0.0;
        } else {
            this.devicePrice = devicePrice;
        }
    }

    public double getAmount() {
        return this.devicePrice * this.deviceQuantities;
    }
}
