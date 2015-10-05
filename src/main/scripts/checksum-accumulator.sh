#!/usr/bin/env bash

THIS_DIR=`dirname $(readlink -f $0)`
source ${THIS_DIR}/main-classpath.sh

scala -cp ${CLASSPATH} classesobjects.ChecksumAccumulator $@
