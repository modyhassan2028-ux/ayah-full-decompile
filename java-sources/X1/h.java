package X1;

import T1.C0485b;
import T1.Y;
import T1.f0;
import W.AbstractC0607v1;
import androidx.datastore.preferences.protobuf.AbstractC0746u;
import androidx.datastore.preferences.protobuf.AbstractC0748w;
import androidx.datastore.preferences.protobuf.C0733g;
import androidx.datastore.preferences.protobuf.C0737k;
import androidx.datastore.preferences.protobuf.C0750y;
import androidx.datastore.preferences.protobuf.InterfaceC0747v;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import p120l9.m;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f9852a = new h();

    @Override // T1.Y
    public final Object a() {
        return new b(true);
    }

    @Override // T1.Y
    public final void b(Object obj, f0 f0Var) throws IOException {
        AbstractC0746u abstractC0746uA;
        Map mapA = ((b) obj).a();
        W1.b bVarN = W1.d.n();
        for (Map.Entry entry : mapA.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.f9850a;
            if (value instanceof Boolean) {
                W1.g gVarD = W1.h.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                gVarD.c();
                W1.h.q((W1.h) gVarD.f12507s, zBooleanValue);
                abstractC0746uA = gVarD.a();
            } else if (value instanceof Float) {
                W1.g gVarD2 = W1.h.D();
                float fFloatValue = ((Number) value).floatValue();
                gVarD2.c();
                W1.h.r((W1.h) gVarD2.f12507s, fFloatValue);
                abstractC0746uA = gVarD2.a();
            } else if (value instanceof Double) {
                W1.g gVarD3 = W1.h.D();
                double dDoubleValue = ((Number) value).doubleValue();
                gVarD3.c();
                W1.h.o((W1.h) gVarD3.f12507s, dDoubleValue);
                abstractC0746uA = gVarD3.a();
            } else if (value instanceof Integer) {
                W1.g gVarD4 = W1.h.D();
                int iIntValue = ((Number) value).intValue();
                gVarD4.c();
                W1.h.s((W1.h) gVarD4.f12507s, iIntValue);
                abstractC0746uA = gVarD4.a();
            } else if (value instanceof Long) {
                W1.g gVarD5 = W1.h.D();
                long jLongValue = ((Number) value).longValue();
                gVarD5.c();
                W1.h.l((W1.h) gVarD5.f12507s, jLongValue);
                abstractC0746uA = gVarD5.a();
            } else if (value instanceof String) {
                W1.g gVarD6 = W1.h.D();
                gVarD6.c();
                W1.h.m((W1.h) gVarD6.f12507s, (String) value);
                abstractC0746uA = gVarD6.a();
            } else if (value instanceof Set) {
                W1.g gVarD7 = W1.h.D();
                W1.e eVarO = W1.f.o();
                eVarO.c();
                W1.f.l((W1.f) eVarO.f12507s, (Set) value);
                gVarD7.c();
                W1.h.n((W1.h) gVarD7.f12507s, (W1.f) eVarO.a());
                abstractC0746uA = gVarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                W1.g gVarD8 = W1.h.D();
                byte[] bArr = (byte[]) value;
                C0733g c0733gD = C0733g.d(bArr, 0, bArr.length);
                gVarD8.c();
                W1.h.p((W1.h) gVarD8.f12507s, c0733gD);
                abstractC0746uA = gVarD8.a();
            }
            bVarN.getClass();
            str.getClass();
            bVarN.c();
            W1.d.l((W1.d) bVarN.f12507s).put(str, (W1.h) abstractC0746uA);
        }
        W1.d dVar = (W1.d) bVarN.a();
        int iA = dVar.a(null);
        Logger logger = C0737k.f12478i;
        if (iA > 4096) {
            iA = 4096;
        }
        C0737k c0737k = new C0737k(f0Var, iA);
        dVar.b(c0737k);
        if (c0737k.g > 0) {
            c0737k.c0();
        }
    }

    @Override // T1.Y
    public final Object c(FileInputStream fileInputStream) throws C0485b {
        byte[] bArr;
        try {
            W1.d dVarO = W1.d.o(fileInputStream);
            b bVar = new b(false);
            f[] fVarArr = (f[]) Arrays.copyOf(new f[0], 0);
            j.e(fVarArr, "pairs");
            bVar.b();
            if (fVarArr.length > 0) {
                f fVar = fVarArr[0];
                throw null;
            }
            Map mapM = dVarO.m();
            j.d(mapM, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                W1.h hVar = (W1.h) entry.getValue();
                j.d(str, "name");
                j.d(hVar, "value");
                int iC = hVar.C();
                switch (iC == 0 ? -1 : g.f9851a[AbstractC0607v1.b(iC)]) {
                    case -1:
                        throw new C0485b("Value case is null.", null);
                    case 0:
                    default:
                        throw new A6.a();
                    case 1:
                        bVar.f(B9.a.g(str), Boolean.valueOf(hVar.t()));
                        break;
                    case 2:
                        bVar.f(new e(str), Float.valueOf(hVar.x()));
                        break;
                    case 3:
                        bVar.f(new e(str), Double.valueOf(hVar.w()));
                        break;
                    case 4:
                        bVar.f(B9.a.J(str), Integer.valueOf(hVar.y()));
                        break;
                    case 5:
                        bVar.f(new e(str), Long.valueOf(hVar.z()));
                        break;
                    case 6:
                        e eVarZ = B9.a.Z(str);
                        String strA = hVar.A();
                        j.d(strA, "value.string");
                        bVar.f(eVarZ, strA);
                        break;
                    case 7:
                        e eVarA0 = B9.a.a0(str);
                        InterfaceC0747v interfaceC0747vN = hVar.B().n();
                        j.d(interfaceC0747vN, "value.stringSet.stringsList");
                        bVar.f(eVarA0, m.G0(interfaceC0747vN));
                        break;
                    case 8:
                        e eVar = new e(str);
                        C0733g c0733gU = hVar.u();
                        int size = c0733gU.size();
                        if (size == 0) {
                            bArr = AbstractC0748w.f12519b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            c0733gU.e(size, bArr2);
                            bArr = bArr2;
                        }
                        j.d(bArr, "value.bytes.toByteArray()");
                        bVar.f(eVar, bArr);
                        break;
                    case 9:
                        throw new C0485b("Value not set.", null);
                }
            }
            return bVar.h();
        } catch (C0750y e10) {
            throw new C0485b("Unable to parse preferences proto.", e10);
        }
    }
}
