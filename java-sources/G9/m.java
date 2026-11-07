package G9;

import E2.C0124h;
import K9.AbstractC0399q;
import T1.C0485b;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import androidx.lifecycle.K;
import com.ayah.MainActivity;
import com.ayah.common.ui.view.QuranAyahTextView;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.Map;
import p110k9.y;
import p173r2.v;
import p173r2.x;
import p181s2.C1305a;
import p214w.B;
import p214w.C1401n;
import p223x.AbstractC1413d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2943r;

    public /* synthetic */ m(int i10) {
        this.f2943r = i10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f2943r;
        int i11 = 11;
        int i12 = 10;
        int i13 = 12;
        y yVar = y.f19095a;
        switch (i10) {
            case 0:
                return Boolean.valueOf(obj == null);
            case 1:
                p150o9.f fVar = (p150o9.f) obj;
                if (fVar instanceof AbstractC0399q) {
                    return (AbstractC0399q) fVar;
                }
                return null;
            case 2:
                return yVar;
            case 3:
                return obj;
            case 4:
                p251z9.j.e((M3.a) obj, "it");
                return yVar;
            case 5:
                p251z9.j.e((M3.a) obj, "it");
                return yVar;
            case 6:
                C0485b c0485b = (C0485b) obj;
                p251z9.j.e(c0485b, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", c0485b);
                return T8.h.f7953b;
            case 7:
                p124m3.a aVar = (p124m3.a) obj;
                p251z9.j.e(aVar, "it");
                return aVar.b();
            case 8:
                W9.a aVar2 = (W9.a) obj;
                p251z9.j.e(aVar2, "$this$buildSerialDescriptor");
                W9.a.a(aVar2, "JsonPrimitive", new Z9.l(new Ba.b(8)));
                W9.a.a(aVar2, "JsonNull", new Z9.l(new Ba.b(9)));
                W9.a.a(aVar2, "JsonLiteral", new Z9.l(new Ba.b(i12)));
                W9.a.a(aVar2, "JsonObject", new Z9.l(new Ba.b(i11)));
                W9.a.a(aVar2, "JsonArray", new Z9.l(new Ba.b(i13)));
                return yVar;
            case 9:
                Map.Entry entry = (Map.Entry) obj;
                p251z9.j.e(entry, "<destruct>");
                String str = (String) entry.getKey();
                Z9.i iVar = (Z9.i) entry.getValue();
                StringBuilder sb = new StringBuilder();
                p009aa.p.a(str, sb);
                sb.append(':');
                sb.append(iVar);
                String string = sb.toString();
                p251z9.j.d(string, "toString(...)");
                return string;
            case 10:
                p071g9.b bVar = (p071g9.b) obj;
                int i14 = MainActivity.f13622J0;
                p251z9.j.e(bVar, "$this$type");
                p071g9.b.a(bVar, 95);
                return yVar;
            case 11:
                p071g9.b bVar2 = (p071g9.b) obj;
                int i15 = MainActivity.f13622J0;
                p251z9.j.e(bVar2, "$this$type");
                p071g9.b.a(bVar2, 120);
                return yVar;
            case 12:
                p071g9.b bVar3 = (p071g9.b) obj;
                int i16 = MainActivity.f13622J0;
                p251z9.j.e(bVar3, "$this$type");
                p071g9.b.a(bVar3, 95);
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                p071g9.b bVar4 = (p071g9.b) obj;
                int i17 = MainActivity.f13622J0;
                p251z9.j.e(bVar4, "$this$type");
                p071g9.b.a(bVar4, 125);
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                p071g9.c cVar = (p071g9.c) obj;
                int i18 = MainActivity.f13622J0;
                p251z9.j.e(cVar, "$this$applyInsetter");
                p071g9.c.a(cVar, new m(i11), 216);
                Aa.a aVar3 = cVar.f16343a;
                aVar3.getClass();
                cVar.f16343a = aVar3;
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                p071g9.c cVar2 = (p071g9.c) obj;
                int i19 = MainActivity.f13622J0;
                p251z9.j.e(cVar2, "$this$applyInsetter");
                p071g9.c.a(cVar2, new m(13), 216);
                Aa.a aVar4 = cVar2.f16343a;
                aVar4.getClass();
                cVar2.f16343a = aVar4;
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                p071g9.c cVar3 = (p071g9.c) obj;
                int i20 = MainActivity.f13622J0;
                p251z9.j.e(cVar3, "$this$applyInsetter");
                p071g9.c.a(cVar3, new m(i12), 223);
                Aa.a aVar5 = cVar3.f16343a;
                aVar5.getClass();
                cVar3.f16343a = aVar5;
                return yVar;
            case 17:
                p071g9.c cVar4 = (p071g9.c) obj;
                int i21 = MainActivity.f13622J0;
                p251z9.j.e(cVar4, "$this$applyInsetter");
                p071g9.c.a(cVar4, new m(i13), 209);
                Aa.a aVar6 = cVar4.f16343a;
                aVar6.getClass();
                cVar4.f16343a = aVar6;
                return yVar;
            case 18:
                p079h5.e eVar = (p079h5.e) obj;
                p251z9.j.e(eVar, "item");
                return p067g5.a.g(eVar);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                Context context = (Context) obj;
                p251z9.j.e(context, "context");
                return new QuranAyahTextView(context);
            case 20:
                Context context2 = (Context) obj;
                p251z9.j.e(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 21:
                Context context3 = (Context) obj;
                p251z9.j.e(context3, "it");
                if (context3 instanceof ContextWrapper) {
                    return ((ContextWrapper) context3).getBaseContext();
                }
                return null;
            case 22:
                p251z9.j.e((p105k2.c) obj, "$this$initializer");
                return new p173r2.o();
            case 23:
                v vVar = (v) obj;
                p251z9.j.e(vVar, "it");
                return vVar.f21494t;
            case 24:
                v vVar2 = (v) obj;
                p251z9.j.e(vVar2, "it");
                if (!(vVar2 instanceof x)) {
                    return null;
                }
                C0124h c0124h = ((x) vVar2).f21502w;
                return c0124h.r(c0124h.f1673b);
            case 25:
                return new C1305a(K.b((p105k2.c) obj));
            case 26:
                return B.a(AbstractC1413d.q(700, 0, null, 6), 2);
            case 27:
                v vVar3 = ((p173r2.j) ((C1401n) obj).c()).f21442s;
                p251z9.j.c(vVar3, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i22 = v.f21491v;
                for (v vVar4 : p173r2.i.b((p181s2.h) vVar3)) {
                }
                return null;
            case 28:
                return B.b(AbstractC1413d.q(700, 0, null, 6), 2);
            default:
                return ((p173r2.j) obj).f21446w;
        }
    }
}
