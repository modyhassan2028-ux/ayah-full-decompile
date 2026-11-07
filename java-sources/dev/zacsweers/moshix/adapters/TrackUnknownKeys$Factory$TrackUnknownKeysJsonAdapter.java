package dev.zacsweers.moshix.adapters;

import Da.f;
import Da.h;
import android.support.v4.media.session.p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import com.squareup.moshi.o;
import com.squareup.moshi.q;
import com.squareup.moshi.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class TrackUnknownKeys$Factory$TrackUnknownKeysJsonAdapter<T> extends JsonAdapter<T> {
    private final Class<?> clazz;
    private final JsonAdapter<T> delegate;
    private final a tracker;

    public TrackUnknownKeys$Factory$TrackUnknownKeysJsonAdapter(JsonAdapter<T> jsonAdapter, Class<?> cls, a aVar) {
        j.e(jsonAdapter, "delegate");
        j.e(cls, "clazz");
        j.e(aVar, "tracker");
        this.delegate = jsonAdapter;
        this.clazz = cls;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) throws IOException {
        j.e(nVar, "reader");
        int iN = nVar.N();
        if (iN != 3) {
            throw new A6.a("Expected BEGIN_OBJECT but was " + p.G(iN) + " at path " + nVar.s());
        }
        q qVar = new q(Y2.a.o(new f()));
        qVar.f15487v = true;
        try {
            LinkedHashSet linkedHashSetH = Y2.a.h(new o((o) nVar), qVar);
            qVar.close();
            Object objA = this.delegate.a(nVar);
            h hVar = new h();
            JsonAdapter<T> jsonAdapter = this.delegate;
            q qVar2 = new q(hVar);
            qVar2.f15487v = false;
            jsonAdapter.e(qVar2, objA);
            LinkedHashSet linkedHashSetH2 = Y2.a.h(new o(hVar), new q(Y2.a.o(new f())));
            ArrayList arrayList = new ArrayList();
            for (Object obj : linkedHashSetH) {
                if (!linkedHashSetH2.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return objA;
            }
            throw null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p181s2.o.e(qVar, th);
                throw th2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        j.e(sVar, "writer");
        this.delegate.e(sVar, obj);
    }
}
