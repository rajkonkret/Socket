class Socket {
    private ElectricDevice pluggedDevice;

    Socket() {
        this.pluggedDevice = null;
    }

    void plugIn(ElectricDevice device) {

        if (pluggedDevice != null) {
            pluggedDevice.electricityOff();
        }
        pluggedDevice = device;
        pluggedDevice.electricityOn();
    }


    void plugOut(ElectricDevice device) {
        if (pluggedDevice != null) {
            pluggedDevice.electricityOff();
        }
        pluggedDevice = null;

    }
}
