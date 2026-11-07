package io.realm.internal;

import io.realm.RealmFieldType;

/* JADX INFO: loaded from: classes.dex */
public class OsObjectSchemaInfo implements NativeObject {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private long nativePtr;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddProperties(long j, long[] jArr, long[] jArr2);

    private static native long nativeCreateRealmObjectSchema(String str, String str2, boolean z10);

    private static native String nativeGetClassName(long j);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetPrimaryKeyProperty(long j);

    private static native long nativeGetProperty(long j, String str);

    private static native boolean nativeIsEmbedded(long j);

    public String getClassName() {
        return nativeGetClassName(this.nativePtr);
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.nativePtr;
    }

    public Property getPrimaryKeyProperty() {
        if (nativeGetPrimaryKeyProperty(this.nativePtr) == 0) {
            return null;
        }
        return new Property(nativeGetPrimaryKeyProperty(this.nativePtr));
    }

    public Property getProperty(String str) {
        return new Property(nativeGetProperty(this.nativePtr, str));
    }

    public boolean isEmbedded() {
        return nativeIsEmbedded(this.nativePtr);
    }

    private OsObjectSchemaInfo(String str, String str2, boolean z10) {
        this(nativeCreateRealmObjectSchema(str, str2, z10));
    }

    public OsObjectSchemaInfo(long j) {
        this.nativePtr = j;
        NativeContext.dummyContext.addReference(this);
    }

    public static class Builder {
        private final long[] computedPropertyPtrArray;
        private int computedPropertyPtrCurPos;
        private final boolean embedded;
        private final String internalClassName;
        private final long[] persistedPropertyPtrArray;
        private int persistedPropertyPtrCurPos;
        private final String publicClassName;

        public Builder(String str, boolean z10, int i10, int i11) {
            this.persistedPropertyPtrCurPos = 0;
            this.computedPropertyPtrCurPos = 0;
            this.publicClassName = "";
            this.internalClassName = str;
            this.embedded = z10;
            this.persistedPropertyPtrArray = new long[i10];
            this.computedPropertyPtrArray = new long[i11];
        }

        public Builder addComputedLinkProperty(String str, String str2, String str3) {
            long jNativeCreateComputedLinkProperty = Property.nativeCreateComputedLinkProperty(str, str2, str3);
            long[] jArr = this.computedPropertyPtrArray;
            int i10 = this.computedPropertyPtrCurPos;
            jArr[i10] = jNativeCreateComputedLinkProperty;
            this.computedPropertyPtrCurPos = i10 + 1;
            return this;
        }

        public Builder addPersistedLinkProperty(String str, String str2, RealmFieldType realmFieldType, String str3) {
            long jNativeCreatePersistedLinkProperty = Property.nativeCreatePersistedLinkProperty(str2, str, Property.convertFromRealmFieldType(realmFieldType, false), str3);
            long[] jArr = this.persistedPropertyPtrArray;
            int i10 = this.persistedPropertyPtrCurPos;
            jArr[i10] = jNativeCreatePersistedLinkProperty;
            this.persistedPropertyPtrCurPos = i10 + 1;
            return this;
        }

        public Builder addPersistedMapProperty(String str, String str2, RealmFieldType realmFieldType, boolean z10) {
            long jNativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.convertFromRealmFieldType(realmFieldType, z10), false, false);
            long[] jArr = this.persistedPropertyPtrArray;
            int i10 = this.persistedPropertyPtrCurPos;
            jArr[i10] = jNativeCreatePersistedProperty;
            this.persistedPropertyPtrCurPos = i10 + 1;
            return this;
        }

        public Builder addPersistedProperty(String str, String str2, RealmFieldType realmFieldType, boolean z10, boolean z11, boolean z12) {
            long jNativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.convertFromRealmFieldType(realmFieldType, z12), z10, z11);
            long[] jArr = this.persistedPropertyPtrArray;
            int i10 = this.persistedPropertyPtrCurPos;
            jArr[i10] = jNativeCreatePersistedProperty;
            this.persistedPropertyPtrCurPos = i10 + 1;
            return this;
        }

        public Builder addPersistedSetProperty(String str, String str2, RealmFieldType realmFieldType, boolean z10) {
            long jNativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.convertFromRealmFieldType(realmFieldType, z10), false, false);
            long[] jArr = this.persistedPropertyPtrArray;
            int i10 = this.persistedPropertyPtrCurPos;
            jArr[i10] = jNativeCreatePersistedProperty;
            this.persistedPropertyPtrCurPos = i10 + 1;
            return this;
        }

        public Builder addPersistedValueListProperty(String str, String str2, RealmFieldType realmFieldType, boolean z10) {
            long jNativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.convertFromRealmFieldType(realmFieldType, z10), false, false);
            long[] jArr = this.persistedPropertyPtrArray;
            int i10 = this.persistedPropertyPtrCurPos;
            jArr[i10] = jNativeCreatePersistedProperty;
            this.persistedPropertyPtrCurPos = i10 + 1;
            return this;
        }

        public OsObjectSchemaInfo build() {
            if (this.persistedPropertyPtrCurPos == -1 || this.computedPropertyPtrCurPos == -1) {
                throw new IllegalStateException("'OsObjectSchemaInfo.build()' has been called before on this object.");
            }
            OsObjectSchemaInfo osObjectSchemaInfo = new OsObjectSchemaInfo(this.publicClassName, this.internalClassName, this.embedded);
            OsObjectSchemaInfo.nativeAddProperties(osObjectSchemaInfo.nativePtr, this.persistedPropertyPtrArray, this.computedPropertyPtrArray);
            this.persistedPropertyPtrCurPos = -1;
            this.computedPropertyPtrCurPos = -1;
            return osObjectSchemaInfo;
        }

        public Builder(String str, String str2, boolean z10, int i10, int i11) {
            this.persistedPropertyPtrCurPos = 0;
            this.computedPropertyPtrCurPos = 0;
            this.publicClassName = str;
            this.internalClassName = str2;
            this.embedded = z10;
            this.persistedPropertyPtrArray = new long[i10];
            this.computedPropertyPtrArray = new long[i11];
        }
    }
}
