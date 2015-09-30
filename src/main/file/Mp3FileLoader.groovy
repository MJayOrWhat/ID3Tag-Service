package main.file

class Mp3FileLoader implements IFileLoader {

    List<String> audioFileTypes = ['.mp3', '.ogg', '.wmv', '.wma', '.aac', '.m4a', '.mp4']
    String regexForAudioFile = ".*"


    @Override
    public void loadFiles(File directory) {
        println directory
        directory.listFiles().every { File folderEntry ->
            checkForFileOrFolder(folderEntry)
        }

    }

    protected void checkForFileOrFolder(File folderEntry) {
        if (folderEntry.isFile() && isAudioFile(folderEntry)) {
            MyMP3File mp3File = new MyMP3File(folderEntry)
        }
    }

    boolean isAudioFile(File file) {
        audioFileTypes.any { String audioFilType ->
            file.name.matches(regexForAudioFile + "\\" + audioFilType)
        }
    }
}