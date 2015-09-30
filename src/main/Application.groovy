package main

import main.file.Mp3FileLoader


class Application {

    public static void main(String[] args) {

        File directoryToLoad = new File('src/resources/musicFiles/')

        Mp3FileLoader mp3FileLoader = new Mp3FileLoader()
        mp3FileLoader.loadFiles(directoryToLoad)

    }
}
