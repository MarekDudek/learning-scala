#!/usr/bin/env bash

THIS_DIR=`dirname $(readlink -f $0)`

scala ${THIS_DIR}/simple-script.scala $@