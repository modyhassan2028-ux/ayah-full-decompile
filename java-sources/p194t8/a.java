package p194t8;

import E8.d;
import android.util.Base64;
import android.util.JsonReader;
import io.realm.internal.ObjectServerFacade;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p180s0.C1292a;
import p185s8.A;
import p185s8.A0;
import p185s8.B;
import p185s8.B0;
import p185s8.C;
import p185s8.C0;
import p185s8.C1306a;
import p185s8.C1307a0;
import p185s8.C1308b;
import p185s8.C1309b0;
import p185s8.C1310c;
import p185s8.C1311c0;
import p185s8.C1312d;
import p185s8.C1313d0;
import p185s8.C1314e;
import p185s8.C1315e0;
import p185s8.C1316f;
import p185s8.C1317f0;
import p185s8.C1318g;
import p185s8.C1319g0;
import p185s8.C1320h;
import p185s8.C1321h0;
import p185s8.C1322i;
import p185s8.C1323i0;
import p185s8.C1324j;
import p185s8.C1325j0;
import p185s8.C1326k;
import p185s8.C1327k0;
import p185s8.C1328l;
import p185s8.C1330m;
import p185s8.C1332n;
import p185s8.C1334o;
import p185s8.C1336p;
import p185s8.C1337q;
import p185s8.C1338s;
import p185s8.C1339t;
import p185s8.C1340u;
import p185s8.C1341v;
import p185s8.C1342w;
import p185s8.C1343x;
import p185s8.C1344y;
import p185s8.C1345z;
import p185s8.D;
import p185s8.D0;
import p185s8.E;
import p185s8.E0;
import p185s8.F;
import p185s8.F0;
import p185s8.G;
import p185s8.G0;
import p185s8.H;
import p185s8.H0;
import p185s8.I;
import p185s8.I0;
import p185s8.J;
import p185s8.J0;
import p185s8.K;
import p185s8.K0;
import p185s8.L;
import p185s8.L0;
import p185s8.M;
import p185s8.M0;
import p185s8.N;
import p185s8.N0;
import p185s8.O;
import p185s8.O0;
import p185s8.P;
import p185s8.Q;
import p185s8.S;
import p185s8.T;
import p185s8.U;
import p185s8.V;
import p185s8.W;
import p185s8.X;
import p185s8.Y;
import p185s8.Z;
import p185s8.p0;
import p185s8.q0;
import p185s8.r;
import p185s8.r0;
import p185s8.s0;
import p185s8.t0;
import p185s8.u0;
import p185s8.v0;
import p185s8.w0;
import p185s8.x0;
import p185s8.y0;
import p185s8.z0;
import p248z6.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f22646a;

    static {
        d dVar = new d();
        C1312d c1312d = C1312d.f22328a;
        dVar.a(O0.class, c1312d);
        dVar.a(B.class, c1312d);
        C1324j c1324j = C1324j.f22379a;
        dVar.a(N0.class, c1324j);
        dVar.a(J.class, c1324j);
        C1318g c1318g = C1318g.f22355a;
        dVar.a(v0.class, c1318g);
        dVar.a(K.class, c1318g);
        C1320h c1320h = C1320h.f22364a;
        dVar.a(u0.class, c1320h);
        dVar.a(L.class, c1320h);
        C1345z c1345z = C1345z.f22490a;
        dVar.a(M0.class, c1345z);
        dVar.a(C1327k0.class, c1345z);
        C1344y c1344y = C1344y.f22485a;
        dVar.a(L0.class, c1344y);
        dVar.a(C1325j0.class, c1344y);
        C1322i c1322i = C1322i.f22366a;
        dVar.a(w0.class, c1322i);
        dVar.a(N.class, c1322i);
        C1339t c1339t = C1339t.f22460a;
        dVar.a(K0.class, c1339t);
        dVar.a(P.class, c1339t);
        C1326k c1326k = C1326k.f22394a;
        dVar.a(E0.class, c1326k);
        dVar.a(Q.class, c1326k);
        C1330m c1330m = C1330m.f22410a;
        dVar.a(C0.class, c1330m);
        dVar.a(S.class, c1330m);
        C1336p c1336p = C1336p.f22439a;
        dVar.a(B0.class, c1336p);
        dVar.a(W.class, c1336p);
        C1337q c1337q = C1337q.f22443a;
        dVar.a(A0.class, c1337q);
        dVar.a(Y.class, c1337q);
        C1332n c1332n = C1332n.f22422a;
        dVar.a(y0.class, c1332n);
        dVar.a(U.class, c1332n);
        C1308b c1308b = C1308b.f22305a;
        dVar.a(q0.class, c1308b);
        dVar.a(D.class, c1308b);
        C1306a c1306a = C1306a.f22297a;
        dVar.a(p0.class, c1306a);
        dVar.a(E.class, c1306a);
        C1334o c1334o = C1334o.f22434a;
        dVar.a(z0.class, c1334o);
        dVar.a(V.class, c1334o);
        C1328l c1328l = C1328l.f22402a;
        dVar.a(x0.class, c1328l);
        dVar.a(T.class, c1328l);
        C1310c c1310c = C1310c.f22319a;
        dVar.a(r0.class, c1310c);
        dVar.a(F.class, c1310c);
        r rVar = r.f22449a;
        dVar.a(D0.class, rVar);
        dVar.a(C1307a0.class, rVar);
        C1338s c1338s = C1338s.f22454a;
        dVar.a(F0.class, c1338s);
        dVar.a(C1311c0.class, c1338s);
        C1340u c1340u = C1340u.f22466a;
        dVar.a(G0.class, c1340u);
        dVar.a(C1313d0.class, c1340u);
        C1343x c1343x = C1343x.f22483a;
        dVar.a(J0.class, c1343x);
        dVar.a(C1321h0.class, c1343x);
        C1341v c1341v = C1341v.f22475a;
        dVar.a(I0.class, c1341v);
        dVar.a(C1317f0.class, c1341v);
        C1342w c1342w = C1342w.f22480a;
        dVar.a(H0.class, c1342w);
        dVar.a(C1319g0.class, c1342w);
        C1314e c1314e = C1314e.f22340a;
        dVar.a(t0.class, c1314e);
        dVar.a(G.class, c1314e);
        C1316f c1316f = C1316f.f22348a;
        dVar.a(s0.class, c1316f);
        dVar.a(H.class, c1316f);
        dVar.f1986d = true;
        f22646a = new c(5, dVar);
    }

    public static Y a(JsonReader jsonReader) throws IOException {
        X x9 = new X();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    x9.f22284d = jsonReader.nextLong();
                    x9.f22286f = (byte) (x9.f22286f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    x9.f22282b = strNextString;
                    break;
                    break;
                case "pc":
                    x9.f22281a = jsonReader.nextLong();
                    x9.f22286f = (byte) (x9.f22286f | 1);
                    break;
                case "file":
                    x9.f22283c = jsonReader.nextString();
                    break;
                case "importance":
                    x9.f22285e = jsonReader.nextInt();
                    x9.f22286f = (byte) (x9.f22286f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return x9.a();
    }

    public static F b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new F(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb));
    }

    public static D c(JsonReader jsonReader) throws IOException {
        C c10 = new C();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c10.f22181i = d(jsonReader, new C1292a(17));
                    break;
                case "pid":
                    c10.f22174a = jsonReader.nextInt();
                    c10.j = (byte) (c10.j | 1);
                    break;
                case "pss":
                    c10.f22178e = jsonReader.nextLong();
                    c10.j = (byte) (c10.j | 8);
                    break;
                case "rss":
                    c10.f22179f = jsonReader.nextLong();
                    c10.j = (byte) (c10.j | 16);
                    break;
                case "timestamp":
                    c10.g = jsonReader.nextLong();
                    c10.j = (byte) (c10.j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c10.f22175b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    c10.f22176c = jsonReader.nextInt();
                    c10.j = (byte) (c10.j | 2);
                    break;
                case "traceFile":
                    c10.f22180h = jsonReader.nextString();
                    break;
                case "importance":
                    c10.f22177d = jsonReader.nextInt();
                    c10.j = (byte) (c10.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c10.a();
    }

    public static List d(JsonReader jsonReader, C1292a c1292a) throws IOException {
        Object e10;
        Object h7;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String strNextString = null;
            switch (c1292a.f21817r) {
                case 17:
                    jsonReader.beginObject();
                    String strNextString2 = null;
                    String strNextString3 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName = jsonReader.nextName();
                        strNextName.getClass();
                        switch (strNextName) {
                            case "libraryName":
                                strNextString2 = jsonReader.nextString();
                                if (strNextString2 == null) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                break;
                                break;
                            case "arch":
                                String strNextString4 = jsonReader.nextString();
                                if (strNextString4 == null) {
                                    throw new NullPointerException("Null arch");
                                }
                                strNextString = strNextString4;
                                break;
                                break;
                            case "buildId":
                                strNextString3 = jsonReader.nextString();
                                if (strNextString3 == null) {
                                    throw new NullPointerException("Null buildId");
                                }
                                break;
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString == null || strNextString2 == null || strNextString3 == null) {
                        StringBuilder sb = new StringBuilder();
                        if (strNextString == null) {
                            sb.append(" arch");
                        }
                        if (strNextString2 == null) {
                            sb.append(" libraryName");
                        }
                        if (strNextString3 == null) {
                            sb.append(" buildId");
                        }
                        throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb));
                    }
                    e10 = new E(strNextString, strNextString2, strNextString3);
                    continue;
                    arrayList.add(e10);
                    break;
                case 18:
                    jsonReader.beginObject();
                    byte[] bArrDecode = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("filename")) {
                            String strNextString5 = jsonReader.nextString();
                            if (strNextString5 == null) {
                                throw new NullPointerException("Null filename");
                            }
                            strNextString = strNextString5;
                        } else if (strNextName2.equals("contents")) {
                            bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                            if (bArrDecode == null) {
                                throw new NullPointerException("Null contents");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString == null || bArrDecode == null) {
                        StringBuilder sb2 = new StringBuilder();
                        if (strNextString == null) {
                            sb2.append(" filename");
                        }
                        if (bArrDecode == null) {
                            sb2.append(" contents");
                        }
                        throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb2));
                    }
                    h7 = new H(strNextString, bArrDecode);
                    break;
                case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                    C1315e0 c1315e0 = new C1315e0();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "parameterKey":
                                String strNextString6 = jsonReader.nextString();
                                if (strNextString6 == null) {
                                    throw new NullPointerException("Null parameterKey");
                                }
                                c1315e0.f22344b = strNextString6;
                                break;
                                break;
                            case "templateVersion":
                                c1315e0.f22346d = jsonReader.nextLong();
                                c1315e0.f22347e = (byte) (c1315e0.f22347e | 1);
                                break;
                            case "rolloutVariant":
                                jsonReader.beginObject();
                                String strNextString7 = null;
                                String strNextString8 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    if (strNextName4.equals("variantId")) {
                                        strNextString8 = jsonReader.nextString();
                                        if (strNextString8 == null) {
                                            throw new NullPointerException("Null variantId");
                                        }
                                    } else if (strNextName4.equals("rolloutId")) {
                                        strNextString7 = jsonReader.nextString();
                                        if (strNextString7 == null) {
                                            throw new NullPointerException("Null rolloutId");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString7 != null && strNextString8 != null) {
                                    c1315e0.f22343a = new C1319g0(strNextString7, strNextString8);
                                    break;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (strNextString7 == null) {
                                        sb3.append(" rolloutId");
                                    }
                                    if (strNextString8 == null) {
                                        sb3.append(" variantId");
                                    }
                                    throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb3));
                                }
                                break;
                            case "parameterValue":
                                String strNextString9 = jsonReader.nextString();
                                if (strNextString9 == null) {
                                    throw new NullPointerException("Null parameterValue");
                                }
                                c1315e0.f22345c = strNextString9;
                                break;
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    e10 = c1315e0.a();
                    continue;
                    arrayList.add(e10);
                    break;
                case 20:
                    jsonReader.beginObject();
                    List listD = null;
                    byte b5 = 0;
                    int iNextInt = 0;
                    while (jsonReader.hasNext()) {
                        String strNextName5 = jsonReader.nextName();
                        strNextName5.getClass();
                        switch (strNextName5) {
                            case "frames":
                                listD = d(jsonReader, new C1292a(22));
                                if (listD == null) {
                                    throw new NullPointerException("Null frames");
                                }
                                break;
                                break;
                            case "name":
                                strNextString = jsonReader.nextString();
                                if (strNextString == null) {
                                    throw new NullPointerException("Null name");
                                }
                                break;
                            case "importance":
                                iNextInt = jsonReader.nextInt();
                                b5 = (byte) (b5 | 1);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b5 != 1 || strNextString == null || listD == null) {
                        StringBuilder sb4 = new StringBuilder();
                        if (strNextString == null) {
                            sb4.append(" name");
                        }
                        if ((b5 & 1) == 0) {
                            sb4.append(" importance");
                        }
                        if (listD == null) {
                            sb4.append(" frames");
                        }
                        throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb4));
                    }
                    h7 = new W(iNextInt, strNextString, listD);
                    break;
                case 21:
                    jsonReader.beginObject();
                    String str = null;
                    String str2 = null;
                    byte b10 = 0;
                    long jNextLong = 0;
                    long jNextLong2 = 0;
                    while (jsonReader.hasNext()) {
                        String strNextName6 = jsonReader.nextName();
                        strNextName6.getClass();
                        switch (strNextName6) {
                            case "name":
                                String strNextString10 = jsonReader.nextString();
                                if (strNextString10 == null) {
                                    throw new NullPointerException("Null name");
                                }
                                str = strNextString10;
                                break;
                                break;
                            case "size":
                                b10 = (byte) (b10 | 2);
                                jNextLong2 = jsonReader.nextLong();
                                break;
                            case "uuid":
                                str2 = new String(Base64.decode(jsonReader.nextString(), 2), O0.f22248a);
                                break;
                            case "baseAddress":
                                b10 = (byte) (b10 | 1);
                                jNextLong = jsonReader.nextLong();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b10 != 3 || str == null) {
                        StringBuilder sb5 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb5.append(" baseAddress");
                        }
                        if ((b10 & 2) == 0) {
                            sb5.append(" size");
                        }
                        if (str == null) {
                            sb5.append(" name");
                        }
                        throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb5));
                    }
                    e10 = new T(jNextLong, jNextLong2, str, str2);
                    continue;
                    arrayList.add(e10);
                    break;
                default:
                    e10 = a(jsonReader);
                    continue;
                    arrayList.add(e10);
                    break;
            }
            e10 = h7;
            arrayList.add(e10);
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:156:0x0252  */
    /* JADX WARN: Code duplicated, block: B:240:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public static P e(JsonReader jsonReader) throws IOException {
        O o10 = new O();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    C1309b0 c1309b0 = new C1309b0();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                c1309b0.f22313a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                c1309b0.f22314b = jsonReader.nextInt();
                                c1309b0.g = (byte) (c1309b0.g | 1);
                                break;
                            case "orientation":
                                c1309b0.f22316d = jsonReader.nextInt();
                                c1309b0.g = (byte) (c1309b0.g | 4);
                                break;
                            case "diskUsed":
                                c1309b0.f22318f = jsonReader.nextLong();
                                c1309b0.g = (byte) (c1309b0.g | 16);
                                break;
                            case "ramUsed":
                                c1309b0.f22317e = jsonReader.nextLong();
                                c1309b0.g = (byte) (c1309b0.g | 8);
                                break;
                            case "proximityOn":
                                c1309b0.f22315c = jsonReader.nextBoolean();
                                c1309b0.g = (byte) (c1309b0.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    o10.f22245d = c1309b0.a();
                    break;
                case "rollouts":
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            List listD = d(jsonReader, new C1292a(19));
                            if (listD == null) {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                            list = listD;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        throw new IllegalStateException("Missing required properties: rolloutAssignments");
                    }
                    o10.f22247f = new C1321h0(list);
                    break;
                    break;
                case "app":
                    jsonReader.beginObject();
                    byte b5 = 0;
                    int iNextInt = 0;
                    S s10 = null;
                    List listUnmodifiableList = null;
                    List listUnmodifiableList2 = null;
                    Boolean boolValueOf = null;
                    C1307a0 c1307a0G = null;
                    List listUnmodifiableList3 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList3 = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case "background":
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                List listD2 = null;
                                U uF = null;
                                D dC = null;
                                V v10 = null;
                                List listD3 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            dC = c(jsonReader);
                                            break;
                                        case "threads":
                                            listD2 = d(jsonReader, new C1292a(20));
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            long jNextLong = 0;
                                            byte b10 = 0;
                                            String strNextString = null;
                                            String strNextString2 = null;
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        b10 = (byte) (b10 | 1);
                                                        jNextLong = jsonReader.nextLong();
                                                        break;
                                                    case "code":
                                                        strNextString2 = jsonReader.nextString();
                                                        if (strNextString2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                        break;
                                                    case "name":
                                                        strNextString = jsonReader.nextString();
                                                        if (strNextString == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b10 == 1 && strNextString != null && strNextString2 != null) {
                                                v10 = new V(jNextLong, strNextString, strNextString2);
                                                break;
                                            } else {
                                                StringBuilder sb = new StringBuilder();
                                                if (strNextString == null) {
                                                    sb.append(" name");
                                                }
                                                if (strNextString2 == null) {
                                                    sb.append(" code");
                                                }
                                                if ((b10 & 1) == 0) {
                                                    sb.append(" address");
                                                }
                                                throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb));
                                            }
                                            break;
                                        case "binaries":
                                            listD3 = d(jsonReader, new C1292a(21));
                                            if (listD3 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            break;
                                        case "exception":
                                            uF = f(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (v10 != null && listD3 != null) {
                                    s10 = new S(listD2, uF, dC, v10, listD3);
                                    break;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (v10 == null) {
                                        sb2.append(" signal");
                                    }
                                    if (listD3 == null) {
                                        sb2.append(" binaries");
                                    }
                                    throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb2));
                                }
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList2 = DesugarCollections.unmodifiableList(arrayList2);
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList3);
                                break;
                            case "uiOrientation":
                                iNextInt = jsonReader.nextInt();
                                b5 = (byte) 1;
                                break;
                            case "currentProcessDetails":
                                c1307a0G = g(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b5 == 1 && s10 != null) {
                        o10.f22244c = new Q(s10, listUnmodifiableList, listUnmodifiableList2, boolValueOf, c1307a0G, listUnmodifiableList3, iNextInt);
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        if (s10 == null) {
                            sb3.append(" execution");
                        }
                        if (b5 == 0) {
                            sb3.append(" uiOrientation");
                        }
                        throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb3));
                    }
                    break;
                case "log":
                    jsonReader.beginObject();
                    String str = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            String strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null content");
                            }
                            str = strNextString3;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str == null) {
                        throw new IllegalStateException("Missing required properties: content");
                    }
                    o10.f22246e = new C1313d0(str);
                    break;
                    break;
                case "type":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null type");
                    }
                    o10.f22243b = strNextString4;
                    break;
                    break;
                case "timestamp":
                    o10.f22242a = jsonReader.nextLong();
                    o10.g = (byte) (o10.g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return o10.a();
    }

    public static U f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        int iNextInt = 0;
        String str = null;
        String strNextString = null;
        List list = null;
        U uF = null;
        byte b5 = 0;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b5 == 1 && str != null && list != null) {
                    return new U(str, strNextString, list, uF, iNextInt);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" type");
                }
                if (list == null) {
                    sb.append(" frames");
                }
                if ((b5 & 1) == 0) {
                    sb.append(" overflowCount");
                }
                throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb));
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    List listD = d(jsonReader, new C1292a(22));
                    if (listD == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = listD;
                    break;
                    break;
                case "reason":
                    strNextString = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = strNextString2;
                    break;
                    break;
                case "causedBy":
                    uF = f(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b5 = (byte) (b5 | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static C1307a0 g(JsonReader jsonReader) throws IOException {
        Z z10 = new Z();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    z10.f22293b = jsonReader.nextInt();
                    z10.f22296e = (byte) (z10.f22296e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    z10.f22292a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    z10.f22295d = jsonReader.nextBoolean();
                    z10.f22296e = (byte) (z10.f22296e | 4);
                    break;
                case "importance":
                    z10.f22294c = jsonReader.nextInt();
                    z10.f22296e = (byte) (z10.f22296e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return z10.a();
    }

    public static B h(JsonReader jsonReader) throws IOException {
        Charset charset = O0.f22248a;
        A a9 = new A();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    jsonReader.beginObject();
                    List listD = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            listD = d(jsonReader, new C1292a(18));
                            if (listD == null) {
                                throw new NullPointerException("Null files");
                            }
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listD == null) {
                        throw new IllegalStateException("Missing required properties: files");
                    }
                    a9.f22161k = new G(listD, strNextString);
                    continue;
                    break;
                    break;
                case "sdkVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    a9.f22153a = strNextString2;
                    break;
                    break;
                case "appQualitySessionId":
                    a9.g = jsonReader.nextString();
                    break;
                case "appExitInfo":
                    a9.f22162l = c(jsonReader);
                    break;
                case "buildVersion":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    a9.f22159h = strNextString3;
                    break;
                    break;
                case "firebaseAuthenticationToken":
                    a9.f22158f = jsonReader.nextString();
                    break;
                case "gmpAppId":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    a9.f22154b = strNextString4;
                    break;
                    break;
                case "installationUuid":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    a9.f22156d = strNextString5;
                    break;
                    break;
                case "firebaseInstallationId":
                    a9.f22157e = jsonReader.nextString();
                    break;
                case "platform":
                    a9.f22155c = jsonReader.nextInt();
                    a9.f22163m = (byte) (a9.f22163m | 1);
                    break;
                case "displayVersion":
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    a9.f22160i = strNextString6;
                    break;
                    break;
                case "session":
                    I i10 = new I();
                    i10.f22204f = false;
                    i10.f22209m = (byte) (i10.f22209m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                i10.f22202d = jsonReader.nextLong();
                                i10.f22209m = (byte) (i10.f22209m | 1);
                                break;
                            case "appQualitySessionId":
                                i10.f22201c = jsonReader.nextString();
                                break;
                            case "identifier":
                                i10.f22200b = new String(Base64.decode(jsonReader.nextString(), 2), O0.f22248a);
                                break;
                            case "endedAt":
                                i10.f22203e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                M m10 = new M();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            m10.f22231f = jsonReader.nextBoolean();
                                            m10.j = (byte) (m10.j | 16);
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            m10.f22232h = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            m10.f22229d = jsonReader.nextLong();
                                            m10.j = (byte) (m10.j | 4);
                                            break;
                                        case "arch":
                                            m10.f22226a = jsonReader.nextInt();
                                            m10.j = (byte) (m10.j | 1);
                                            break;
                                        case "diskSpace":
                                            m10.f22230e = jsonReader.nextLong();
                                            m10.j = (byte) (m10.j | 8);
                                            break;
                                        case "cores":
                                            m10.f22228c = jsonReader.nextInt();
                                            m10.j = (byte) (m10.j | 2);
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            m10.f22227b = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            m10.g = jsonReader.nextInt();
                                            m10.j = (byte) (m10.j | 32);
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            m10.f22233i = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                i10.j = m10.a();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                i10.f22207k = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case "os":
                                C1323i0 c1323i0 = new C1323i0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            c1323i0.f22376c = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            c1323i0.f22377d = jsonReader.nextBoolean();
                                            c1323i0.f22378e = (byte) (c1323i0.f22378e | 2);
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            c1323i0.f22375b = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            c1323i0.f22374a = jsonReader.nextInt();
                                            c1323i0.f22378e = (byte) (c1323i0.f22378e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                i10.f22206i = c1323i0.a();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                            break;
                                        case "developmentPlatform":
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            strNextString17 = jsonReader.nextString();
                                            break;
                                        case "version":
                                            strNextString13 = jsonReader.nextString();
                                            if (strNextString13 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                            break;
                                        case "installationUuid":
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString12 != null && strNextString13 != null) {
                                    i10.g = new K(strNextString12, strNextString13, strNextString14, strNextString15, strNextString16, strNextString17);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (strNextString12 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (strNextString13 == null) {
                                        sb.append(" version");
                                    }
                                    throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb));
                                }
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString18 == null) {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                                i10.f22205h = new C1327k0(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                i10.f22199a = strNextString19;
                                break;
                                break;
                            case "crashed":
                                i10.f22204f = jsonReader.nextBoolean();
                                i10.f22209m = (byte) (i10.f22209m | 2);
                                break;
                            case "generatorType":
                                i10.f22208l = jsonReader.nextInt();
                                i10.f22209m = (byte) (i10.f22209m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    a9.j = i10.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a9.a();
    }

    public static B i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                B bH = h(jsonReader);
                jsonReader.close();
                return bH;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
