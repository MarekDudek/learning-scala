#!/usr/bin/env bash

THIS_FILE=$(readlink -f $0)
THIS_DIR=`dirname ${THIS_FILE}`


scala ${THIS_DIR}/simple-script.scala $@