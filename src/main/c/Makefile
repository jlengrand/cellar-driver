# JAVA_HOME=/usr/lib/jvm/java-11-openjdk-armhf
INCLUDES = -I. -I../java  -Iadafruit/Raspberry_Pi_2 -I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/linux -I$(JAVA_HOME)/include/darwin
HEADERS = ../../../target/headers/nl_lengrand_cellar_Dht11Driver.h adafruit/common_dht_read.h adafruit/Raspberry_Pi_2/pi_2_mmio.h adafruit/Raspberry_Pi_2/pi_2_dht_read.h
FILES = adafruit/common_dht_read.c adafruit/Raspberry_Pi_2/pi_2_mmio.c adafruit/Raspberry_Pi_2/pi_2_dht_read.c Dht11Driver.c
OUT = libdht11

default: library copy

program: Dht11Driver.c
	arm-linux-gnueabihf-gcc -Wall $(INCLUDES) $(HEADERS) $(FILES) -o $(OUT)

library:
	arm-linux-gnueabihf-gcc -shared -fPIC -o $(OUT).so $(INCLUDES) $(FILES)

copy:
	-cp $(OUT).so ../resources/libs/raspberry/

clean:
	-rm -f $(OUT).so
	-rm -f $(OUT)
