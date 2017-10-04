#!/usr/bin/env bash


if ./runcrud.sh; then
    open http://localhost:8080/crud/v1/task/getTasks
    echo "Work is finished :)"
else
    echo "There were errors in showtasks"
fi

