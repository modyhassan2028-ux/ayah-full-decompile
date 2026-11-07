package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends ZoneId {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f18007d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient j$.time.zone.f f18009c;

    public static v W(String str, boolean z10) {
        j$.time.zone.f fVarA;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i10 == 0) && ((cCharAt < '0' || cCharAt > '9' || i10 == 0) && ((cCharAt != '~' || i10 == 0) && ((cCharAt != '.' || i10 == 0) && ((cCharAt != '_' || i10 == 0) && ((cCharAt != '+' || i10 == 0) && (cCharAt != '-' || i10 == 0))))))))) {
                    throw new b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVarA = j$.time.zone.i.a(str);
            } catch (j$.time.zone.g e10) {
                if (z10) {
                    throw e10;
                }
                fVarA = null;
            }
            return new v(str, fVarA);
        }
        throw new b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public v(String str, j$.time.zone.f fVar) {
        this.f18008b = str;
        this.f18009c = fVar;
    }

    @Override // j$.time.ZoneId
    public final String j() {
        return this.f18008b;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f R() {
        j$.time.zone.f fVar = this.f18009c;
        return fVar != null ? fVar : j$.time.zone.i.a(this.f18008b);
    }

    private Object writeReplace() {
        return new q((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void V(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f18008b);
    }
}
