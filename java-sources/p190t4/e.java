package p190t4;

import H9.o;
import K9.AbstractC0405x;
import K9.C0401t;
import P9.d;
import R6.g;
import X.C0641m;
import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p040da.a;
import p052ea.b;
import p120l9.m;
import p144o3.h;
import p251z9.j;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f22601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p155p3.a f22602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f22604d;

    public e(Context context, h hVar, p155p3.a aVar) {
        String path;
        j.e(hVar, "reciterModel");
        j.e(aVar, "downloadingPlaybackAudioModel");
        this.f22601a = hVar;
        this.f22602b = aVar;
        File externalFilesDir = context.getExternalFilesDir(null);
        this.f22603c = (externalFilesDir == null || (path = externalFilesDir.getPath()) == null) ? "" : path;
        this.f22604d = AbstractC0405x.z(AbstractC0405x.d(), new C0401t("ServiceAudioDownloadPropagator"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(e eVar, b bVar, c cVar) {
        d dVar;
        List listM1;
        String str;
        Object next;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.f22600v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f22600v = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(eVar, cVar);
            }
        } else {
            dVar = new d(eVar, cVar);
        }
        Object obj = dVar.f22598t;
        int i11 = dVar.f22600v;
        if (i11 == 0) {
            p110k9.a.e(obj);
            String str2 = bVar.f15866r;
            j.d(str2, "key");
            List listM2 = o.m1(o.j1(str2, "https://audio.ayah.app/"), new char[]{'/'});
            if (listM2.size() == 2) {
                String str3 = (String) listM2.get(0);
                listM1 = o.m1((String) listM2.get(1), new char[]{'-'});
                h hVar = eVar.f22601a;
                dVar.f22596r = str3;
                dVar.f22597s = listM1;
                dVar.f22600v = 1;
                Object objB = hVar.b(dVar);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objB == aVar) {
                    return aVar;
                }
                str = str3;
                obj = objB;
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        listM1 = dVar.f22597s;
        str = dVar.f22596r;
        p110k9.a.e(obj);
        Iterator it = ((Iterable) obj).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!j.a(((p065g3.a) next).f16273a, str));
        p065g3.a aVar2 = (p065g3.a) next;
        if (aVar2 != null) {
            return new p155p3.b(Integer.parseInt((String) m.f0(listM1)), aVar2, eVar.f22603c);
        }
        return null;
    }

    @Override // p040da.a
    public final void a(b bVar) {
        h(bVar, new b(bVar, 4));
    }

    @Override // p040da.a
    public final void b(b bVar) {
        h(bVar, new b(bVar, 2));
    }

    @Override // p040da.a
    public final void c(final b bVar, final long j, final long j10, int i10) {
        h(bVar, new p241y9.c() { // from class: t4.c
            @Override // p241y9.c
            public final Object e(Object obj) {
                p155p3.b bVar2 = (p155p3.b) obj;
                j.e(bVar2, "it");
                String str = bVar.f15866r;
                j.d(str, "key");
                return new i6.c(bVar2, str, j, j10);
            }
        });
    }

    @Override // p040da.a
    public final void d(b bVar) {
        h(bVar, new b(bVar, 3));
    }

    @Override // p040da.a
    public final void e(b bVar, g gVar) {
        h(bVar, new b(bVar, 0));
    }

    @Override // p040da.a
    public final void f(b bVar) {
        h(bVar, new b(bVar, 1));
    }

    public final void h(b bVar, p241y9.c cVar) {
        AbstractC0405x.x(this.f22604d, null, new C0641m(this, bVar, cVar, null, 8), 3);
    }
}
