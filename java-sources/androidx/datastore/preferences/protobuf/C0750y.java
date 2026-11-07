package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0750y extends IOException {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12520r;

    public static C0750y a() {
        return new C0750y("Protocol message had invalid UTF-8.");
    }

    public static C0749x b() {
        return new C0749x("Protocol message tag had invalid wire type.");
    }

    public static C0750y c() {
        return new C0750y("CodedInputStream encountered a malformed varint.");
    }

    public static C0750y d() {
        return new C0750y("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0750y e() {
        return new C0750y("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
