DESCRIPTION = "A small image just capable of starting roscore."

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE = "1000000"

IMAGE_INSTALL += " \
	bash \
	dropbear \
	freenect-camera \
	freenect-launch \
	geometry-msgs \
	kernel-modules \
	libserial \
	linux-firmware-brcm43430 \
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
	screen \
	usbutils \
	vim \
	wireless-tools \
	wiringpi \
	wpa-supplicant \
 	rpi-gpio \
 	rpio"
