import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "websites")

     public class Website {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "webId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "webUrl")
    private String mUrl;

    private String mTopic;

    public Website(@Nullable String url, String topic, int grade, String creationDate) {
        mName = url;
        mStyle = topic;
        mScore = grade;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getTopic() {
        return mTopic;
    }

    public void setTopic(String topic) {
        mTopic = topic;
    }

    public int getGrade() {
        return mGrade;
    }

    public void setGrade(int grade) {
        mGrade = grade;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mGrade;
    private String mCreatioDate;
