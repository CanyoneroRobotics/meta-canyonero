DESCRIPTION = "A small image just capable of starting roscore."

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE = "512000"

IMAGE_INSTALL += " \
	bash \
	crda \
	dropbear \
	freenect-camera \
	freenect-launch \
	geometry-msgs \
	iw \
	kernel-modules \
	libserial \
	linux-firmware-brcm43430 \
	linux-firmware-ralink \
	linux-firmware-rtl8192ce \
	linux-firmware-rtl8192cu \
	linux-firmware-rtl8192su \
	packagegroup-ros-comm \
	razor-imu-9dof \
	roslaunch \
	rosserial-arduino \
	rosserial-client \
	rosserial-embeddedlinux \
	rosserial-msgs \
	rosserial-python \
	rpi-gpio \
	rpio \
	screen \
	TFM \
	usbutils \
	vim \
	wireless-tools \
	wireless-tools \
	wiringpi \
	wpa-supplicant \
	wpa-supplicant"
