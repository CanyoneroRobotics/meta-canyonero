# Customize kernel

# look for files in this layer first
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "\
           file://wpa_supplicant.conf \
           "
