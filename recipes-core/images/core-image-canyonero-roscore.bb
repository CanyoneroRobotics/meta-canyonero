DESCRIPTION = "A small image just capable of starting roscore."

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"

IMAGE_INSTALL += " \
	dropbear \
	kernel-modules \
	razor-imu-9dof \
	geometry-msgs \
	roslaunch \
	rosserial-arduino \
	rosserial-client \
	rosserial-embeddedlinux \
	rosserial-msgs \
	rosserial-python \
	rgbd-launch \
	wireless-tools \
	linux-firmware-brcm43430 \
	linux-firmware-rtl8192ce \
	linux-firmware-rtl8192cu \
	linux-firmware-rtl8192su \
	wiringpi \
 	rpio \
 	rpi-gpio \
	usbutils \
	packagegroup-ros-comm"

