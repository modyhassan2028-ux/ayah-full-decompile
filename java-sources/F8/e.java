package F8;

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements C8.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f2525f = Charset.forName("UTF-8");
    public static final C8.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C8.c f2526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final E8.a f2527i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f2528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C8.d f2531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f2532e = new g(this);

    static {
        a aVar = new a(1);
        HashMap map = new HashMap();
        map.put(d.class, aVar);
        g = new C8.c("key", DesugarCollections.unmodifiableMap(new HashMap(map)));
        a aVar2 = new a(2);
        HashMap map2 = new HashMap();
        map2.put(d.class, aVar2);
        f2526h = new C8.c("value", DesugarCollections.unmodifiableMap(new HashMap(map2)));
        f2527i = new E8.a(1);
    }

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C8.d dVar) {
        this.f2528a = byteArrayOutputStream;
        this.f2529b = map;
        this.f2530c = map2;
        this.f2531d = dVar;
    }

    public static int j(C8.c cVar) {
        d dVar = (d) ((Annotation) cVar.f782b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f2521a;
        }
        throw new C8.b("Field has no @Protobuf config");
    }

    @Override // C8.e
    public final C8.e a(C8.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    public final void b(C8.c cVar, double d5, boolean z10) throws IOException {
        if (z10 && d5 == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f2528a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d5).array());
    }

    public final void c(C8.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f782b.get(d.class));
        if (dVar == null) {
            throw new C8.b("Field has no @Protobuf config");
        }
        k(((a) dVar).f2521a << 3);
        k(i10);
    }

    @Override // C8.e
    public final C8.e d(C8.c cVar, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        d dVar = (d) ((Annotation) cVar.f782b.get(d.class));
        if (dVar == null) {
            throw new C8.b("Field has no @Protobuf config");
        }
        k(((a) dVar).f2521a << 3);
        l(j);
        return this;
    }

    @Override // C8.e
    public final C8.e e(C8.c cVar, int i10) {
        c(cVar, i10, true);
        return this;
    }

    @Override // C8.e
    public final C8.e f(C8.c cVar, double d5) throws IOException {
        b(cVar, d5, true);
        return this;
    }

    @Override // C8.e
    public final C8.e g(C8.c cVar, boolean z10) {
        c(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final void h(C8.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f2525f);
            k(bytes.length);
            this.f2528a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(f2527i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(cVar, ((Double) obj).doubleValue(), z10);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z10 && fFloatValue == 0.0f) {
                return;
            }
            k((j(cVar) << 3) | 5);
            this.f2528a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z10 && jLongValue == 0) {
                return;
            }
            d dVar = (d) ((Annotation) cVar.f782b.get(d.class));
            if (dVar == null) {
                throw new C8.b("Field has no @Protobuf config");
            }
            k(((a) dVar).f2521a << 3);
            l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            c(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            k(bArr.length);
            this.f2528a.write(bArr);
            return;
        }
        C8.d dVar2 = (C8.d) this.f2529b.get(obj.getClass());
        if (dVar2 != null) {
            i(dVar2, cVar, obj, z10);
            return;
        }
        C8.f fVar = (C8.f) this.f2530c.get(obj.getClass());
        if (fVar != null) {
            g gVar = this.f2532e;
            gVar.f2534a = false;
            gVar.f2536c = cVar;
            gVar.f2535b = z10;
            fVar.a(obj, gVar);
            return;
        }
        if (obj instanceof H6.c) {
            c(cVar, ((H6.c) obj).f3419r, true);
        } else if (obj instanceof Enum) {
            c(cVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.f2531d, cVar, obj, z10);
        }
    }

    public final void i(C8.d dVar, C8.c cVar, Object obj, boolean z10) throws IOException {
        b bVar = new b();
        bVar.f2522r = 0L;
        try {
            OutputStream outputStream = this.f2528a;
            this.f2528a = bVar;
            try {
                dVar.a(obj, this);
                this.f2528a = outputStream;
                long j = bVar.f2522r;
                bVar.close();
                if (z10 && j == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                l(j);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f2528a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f2528a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f2528a.write(i10 & 127);
    }

    public final void l(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f2528a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f2528a.write(((int) j) & 127);
    }
}
