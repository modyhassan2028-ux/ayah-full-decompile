package E8;

import C8.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements C8.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1987a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f1988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f1989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f1990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C8.d f1991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1992f;

    public e(Writer writer, HashMap map, HashMap map2, a aVar, boolean z10) {
        this.f1988b = new JsonWriter(writer);
        this.f1989c = map;
        this.f1990d = map2;
        this.f1991e = aVar;
        this.f1992f = z10;
    }

    @Override // C8.e
    public final C8.e a(C8.c cVar, Object obj) throws IOException {
        i(obj, cVar.f781a);
        return this;
    }

    @Override // C8.g
    public final g b(String str) throws IOException {
        j();
        this.f1988b.value(str);
        return this;
    }

    @Override // C8.g
    public final g c(boolean z10) throws IOException {
        j();
        this.f1988b.value(z10);
        return this;
    }

    @Override // C8.e
    public final C8.e d(C8.c cVar, long j) throws IOException {
        String str = cVar.f781a;
        j();
        JsonWriter jsonWriter = this.f1988b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    @Override // C8.e
    public final C8.e e(C8.c cVar, int i10) throws IOException {
        String str = cVar.f781a;
        j();
        JsonWriter jsonWriter = this.f1988b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i10);
        return this;
    }

    @Override // C8.e
    public final C8.e f(C8.c cVar, double d5) throws IOException {
        String str = cVar.f781a;
        j();
        JsonWriter jsonWriter = this.f1988b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d5);
        return this;
    }

    @Override // C8.e
    public final C8.e g(C8.c cVar, boolean z10) throws IOException {
        String str = cVar.f781a;
        j();
        JsonWriter jsonWriter = this.f1988b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z10);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.f1988b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new C8.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            C8.d dVar = (C8.d) this.f1989c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            C8.f fVar = (C8.f) this.f1990d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f1991e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof f) {
                int iA = ((f) obj).a();
                j();
                jsonWriter.value(iA);
                return this;
            }
            String strName = ((Enum) obj).name();
            j();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                jsonWriter.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j = jArr[i10];
                j();
                jsonWriter.value(j);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                jsonWriter.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                jsonWriter.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i10 < length5) {
                h(numberArr[i10]);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i10 < length6) {
                h(objArr[i10]);
                i10++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e i(Object obj, String str) throws IOException {
        boolean z10 = this.f1992f;
        JsonWriter jsonWriter = this.f1988b;
        if (z10) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            h(obj);
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        h(obj);
        return this;
    }

    public final void j() {
        if (!this.f1987a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
