package main.file

import org.jaudiotagger.audio.mp3.MP3File
import org.jaudiotagger.tag.id3.ID3v11Tag
import org.jaudiotagger.tag.id3.ID3v24Tag
import static org.jaudiotagger.tag.FieldKey.ARTIST
import static org.jaudiotagger.tag.FieldKey.TITLE

class MyMP3File {

    MP3File mp3File

    String artistName
    String trackName

    public MyMP3File(File mp3file) {
        this.mp3File = new MP3File(mp3file)
        buildObject()
    }

    void buildObject() {
        println getArtistV2Tag()
        println getTitleV2Tag()
    }


    String getArtistV1Tag() {
        return mp3File.ID3v1Tag.getFirst(ARTIST)
    }

    String getTitleV1Tag() {
        return mp3File.ID3v1Tag.getFirst(TITLE)
    }

    String getArtistV2Tag() {
        return mp3File.ID3v2Tag.getFirst(ARTIST)
    }

    String getTitleV2Tag() {
        return mp3File.ID3v2Tag.getFirst(TITLE)
    }

    String getArtwork() {
        return mp3File.ID3v2Tag.firstArtwork
    }
}
