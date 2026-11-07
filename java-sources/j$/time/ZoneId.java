package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f17762a;
    private static final long serialVersionUID = 8352817235686L;

    public abstract j$.time.zone.f R();

    public abstract void V(DataOutput dataOutput);

    public abstract String j();

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.D("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.D("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.D("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.D("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.D("AST", "America/Anchorage"), j$.com.android.tools.r8.a.D("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.D("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.D("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.D("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.D("CST", "America/Chicago"), j$.com.android.tools.r8.a.D("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.D("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.D("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.D("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.D("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.D("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.D("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.D("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.D("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.D("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.D("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.D("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.D("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.D("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.D("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.D("EST", "-05:00"), j$.com.android.tools.r8.a.D("MST", "-07:00"), j$.com.android.tools.r8.a.D("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i10 = 0; i10 < 28; i10++) {
            Map.Entry entry = entryArr[i10];
            Object objRequireNonNull = Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        f17762a = Collections.unmodifiableMap(map);
    }

    public static ZoneId systemDefault() {
        String id = TimeZone.getDefault().getID();
        Map map = f17762a;
        Objects.requireNonNull(id, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        Object objRequireNonNull = (String) map.get(id);
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(id, "defaultObj");
        }
        return S((String) objRequireNonNull, true);
    }

    public static ZoneId T(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.f17766b != 0) {
            str = str.concat(zoneOffset.f17767c);
        }
        return new v(str, zoneOffset.R());
    }

    public static ZoneId S(String str, boolean z10) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.X(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return U(str, 3, z10);
        }
        if (str.startsWith("UT")) {
            return U(str, 2, z10);
        }
        return v.W(str, z10);
    }

    public static ZoneId U(String str, int i10, boolean z10) {
        String strSubstring = str.substring(0, i10);
        if (str.length() == i10) {
            return T(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i10) != '+' && str.charAt(i10) != '-') {
            return v.W(str, z10);
        }
        try {
            ZoneOffset zoneOffsetX = ZoneOffset.X(str.substring(i10));
            if (zoneOffsetX == ZoneOffset.UTC) {
                return T(strSubstring, zoneOffsetX);
            }
            return T(strSubstring, zoneOffsetX);
        } catch (b e10) {
            throw new b("Invalid ID for offset-based ZoneId: ".concat(str), e10);
        }
    }

    public static ZoneId Q(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.v(j$.time.temporal.n.f17983e);
        if (zoneId != null) {
            return zoneId;
        }
        throw new b("Unable to obtain ZoneId from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != v.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return j().equals(((ZoneId) obj).j());
        }
        return false;
    }

    public int hashCode() {
        return j().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return j();
    }

    private Object writeReplace() {
        return new q((byte) 7, this);
    }
}
