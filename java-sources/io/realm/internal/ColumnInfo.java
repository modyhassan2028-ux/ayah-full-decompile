package io.realm.internal;

import android.support.v4.media.session.p;
import io.realm.RealmFieldType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ColumnInfo {
    private final Map<String, ColumnDetails> columnKeysFromColumnNames;
    private final Map<String, ColumnDetails> columnkeysFromJavaFieldNames;
    private final Map<String, String> javaFieldNameToInternalNames;
    private final boolean mutable;

    public static final class ColumnDetails {
        public final long columnKey;
        public final RealmFieldType columnType;
        public final String linkedClassName;

        public String toString() {
            StringBuilder sb = new StringBuilder("ColumnDetails[");
            sb.append(this.columnKey);
            sb.append(", ");
            sb.append(this.columnType);
            sb.append(", ");
            return p.B(sb, this.linkedClassName, "]");
        }

        private ColumnDetails(long j, RealmFieldType realmFieldType, String str) {
            this.columnKey = j;
            this.columnType = realmFieldType;
            this.linkedClassName = str;
        }

        public ColumnDetails(Property property) {
            this(property.getColumnKey(), property.getType(), property.getLinkedObjectName());
        }
    }

    public ColumnInfo(int i10) {
        this(i10, true);
    }

    public final void addBacklinkDetails(OsSchemaInfo osSchemaInfo, String str, String str2, String str3) {
        this.columnkeysFromJavaFieldNames.put(str, new ColumnDetails(osSchemaInfo.getObjectSchemaInfo(str2).getProperty(str3).getColumnKey(), RealmFieldType.LINKING_OBJECTS, str2));
    }

    public final long addColumnDetails(String str, String str2, OsObjectSchemaInfo osObjectSchemaInfo) {
        Property property = osObjectSchemaInfo.getProperty(str2);
        ColumnDetails columnDetails = new ColumnDetails(property);
        this.columnkeysFromJavaFieldNames.put(str, columnDetails);
        this.columnKeysFromColumnNames.put(str2, columnDetails);
        this.javaFieldNameToInternalNames.put(str, str2);
        return property.getColumnKey();
    }

    public abstract ColumnInfo copy(boolean z10);

    public abstract void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2);

    public void copyFrom(ColumnInfo columnInfo) {
        if (!this.mutable) {
            throw new UnsupportedOperationException("Attempt to modify an immutable ColumnInfo");
        }
        if (columnInfo == null) {
            throw new NullPointerException("Attempt to copy null ColumnInfo");
        }
        this.columnkeysFromJavaFieldNames.clear();
        this.columnkeysFromJavaFieldNames.putAll(columnInfo.columnkeysFromJavaFieldNames);
        this.columnKeysFromColumnNames.clear();
        this.columnKeysFromColumnNames.putAll(columnInfo.columnKeysFromColumnNames);
        this.javaFieldNameToInternalNames.clear();
        this.javaFieldNameToInternalNames.putAll(columnInfo.javaFieldNameToInternalNames);
        copy(columnInfo, this);
    }

    public ColumnDetails getColumnDetails(String str) {
        return this.columnkeysFromJavaFieldNames.get(str);
    }

    public long getColumnKey(String str) {
        ColumnDetails columnDetails = this.columnkeysFromJavaFieldNames.get(str);
        if (columnDetails == null) {
            return -1L;
        }
        return columnDetails.columnKey;
    }

    public Map<String, ColumnDetails> getColumnKeysMap() {
        return this.columnkeysFromJavaFieldNames;
    }

    public String getInternalFieldName(String str) {
        return this.javaFieldNameToInternalNames.get(str);
    }

    public final boolean isMutable() {
        return this.mutable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnInfo[");
        sb.append("mutable=" + this.mutable);
        sb.append(",");
        boolean z10 = false;
        if (this.columnkeysFromJavaFieldNames != null) {
            sb.append("JavaFieldNames=[");
            boolean z11 = false;
            for (Map.Entry<String, ColumnDetails> entry : this.columnkeysFromJavaFieldNames.entrySet()) {
                if (z11) {
                    sb.append(",");
                }
                sb.append(entry.getKey());
                sb.append("->");
                sb.append(entry.getValue());
                z11 = true;
            }
            sb.append("]");
        }
        if (this.columnKeysFromColumnNames != null) {
            sb.append(", InternalFieldNames=[");
            for (Map.Entry<String, ColumnDetails> entry2 : this.columnKeysFromColumnNames.entrySet()) {
                if (z10) {
                    sb.append(",");
                }
                sb.append(entry2.getKey());
                sb.append("->");
                sb.append(entry2.getValue());
                z10 = true;
            }
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }

    public ColumnInfo(ColumnInfo columnInfo, boolean z10) {
        this(columnInfo == null ? 0 : columnInfo.columnkeysFromJavaFieldNames.size(), z10);
        if (columnInfo != null) {
            this.columnkeysFromJavaFieldNames.putAll(columnInfo.columnkeysFromJavaFieldNames);
        }
    }

    private ColumnInfo(int i10, boolean z10) {
        this.columnkeysFromJavaFieldNames = new HashMap(i10);
        this.columnKeysFromColumnNames = new HashMap(i10);
        this.javaFieldNameToInternalNames = new HashMap(i10);
        this.mutable = z10;
    }
}
