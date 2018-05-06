package comp_431.privacytracking.database.forward_reference;

        import android.arch.persistence.room.ColumnInfo;
        import android.arch.persistence.room.Entity;
        import android.arch.persistence.room.PrimaryKey;
        import android.support.annotation.NonNull;

        // TODO: Complete this class.
@Entity
public class ForwardReferenceDB {

        @PrimaryKey
        @NonNull
        private String uri;

        @ColumnInfo (name = "forward_reference_id") // Company´s ID which was given the record.
        private String forwardReferenceID;

        @ColumnInfo (name = "source_reference_name") // Company´s ID which was given the record.
        private String  sourceReferenceId;

        public String getUri() {
                return uri;
        }

        public void setUri(String uri) {
                this.uri = uri;
        }
        public String getForwardReferenceID() {
                return forwardReferenceID;
        }

        public void setForwardReferenceID(String forwardReferenceID) {
                this.forwardReferenceID = forwardReferenceID;
        }

        public String getSourceReferenceId() {
                return sourceReferenceId;
        }

        public void setSourceReferenceId(String sourceReferenceId) {
                this.sourceReferenceId = sourceReferenceId;
        }

        }
