package B3;

import M.k;
import Q8.l0;
import S2.g;
import U6.C0532j;
import Y9.M;
import Z.L0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Handler;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.K;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import com.ayah.MainActivity;
import com.ayah.common.data.source.database.BookDatabase_Impl;
import com.ayah.dao.realm.factory.RealmFactory;
import com.ayah.feature.library.edit.view.EditLibraryComposePage;
import com.ayah.feature.library.view.LibraryComposePage;
import com.ayah.feature.onboarding.OnboardingActivity;
import i7.B;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p110k9.y;
import p120l9.w;
import p173r2.t;
import p251z9.j;
import ra.EnumC1290b;
import ra.p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f613s;

    public /* synthetic */ f(int i10, Object obj) {
        this.f612r = i10;
        this.f613s = obj;
    }

    @Override // p241y9.a
    public final Object invoke() {
        int i10 = this.f612r;
        y yVar = y.f19095a;
        int i11 = 0;
        Object obj = this.f613s;
        switch (i10) {
            case 0:
                return new A3.c((BookDatabase_Impl) obj);
            case 1:
                return obj;
            case 2:
                return ((k) obj).c(":memory:");
            case 3:
                M2.e eVar = (M2.e) obj;
                eVar.h().a(new M2.b(i11, eVar));
                return yVar;
            case 4:
                ((l0) obj).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                j.d(uuidRandomUUID, "randomUUID(...)");
                String string = uuidRandomUUID.toString();
                j.d(string, "toString(...)");
                return string;
            case 5:
                g gVar = (g) obj;
                Context context = gVar.f7490r;
                String str = gVar.f7491s;
                O8.c cVar = new O8.c();
                cVar.f6511r = null;
                S2.f fVar = new S2.f(context, str, cVar, gVar.f7492t);
                fVar.setWriteAheadLoggingEnabled(gVar.f7494v);
                return fVar;
            case 6:
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(((T3.a) obj).f7779a.getResources(), 2131230854, new BitmapFactory.Options());
                j.d(bitmapDecodeResource, "decodeResource(...)");
                return bitmapDecodeResource;
            case 7:
                W9.g gVar2 = (W9.g) obj;
                return Integer.valueOf(M.d(gVar2, gVar2.j));
            case 8:
                float f3 = ((Z5.b) obj).f11007v * 9.0f;
                return new RoundRectShape(new float[]{f3, f3, f3, f3, f3, f3, f3, f3}, null, null);
            case 9:
                return Float.valueOf(Math.max(((p047e5.b) obj).f15792d, 0) / 100.0f);
            case 10:
                return K.f((V) obj);
            case 11:
                return Boolean.valueOf(RealmFactory.isInitialized_delegate$lambda$1((RealmFactory) obj));
            case 12:
                int i12 = MainActivity.f13622J0;
                p236y3.a aVar = ((MainActivity) obj).f13625C0;
                if (aVar != null) {
                    return (String) aVar.f24630d.f6130r.getValue();
                }
                j.k("searchModel");
                throw null;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                k3.j jVar = (k3.j) obj;
                return w.i0(new p110k9.j("saturday", Boolean.valueOf(jVar.f18979a)), new p110k9.j("sunday", Boolean.valueOf(jVar.f18980b)), new p110k9.j("monday", Boolean.valueOf(jVar.f18981c)), new p110k9.j("tuesday", Boolean.valueOf(jVar.f18982d)), new p110k9.j("wednesday", Boolean.valueOf(jVar.f18983e)), new p110k9.j("thursday", Boolean.valueOf(jVar.f18984f)), new p110k9.j("friday", Boolean.valueOf(jVar.g)));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return (List) obj;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                int i13 = LibraryComposePage.f13804x;
                Object context2 = ((LibraryComposePage) obj).getContext();
                U3.a aVar2 = context2 instanceof U3.a ? (U3.a) context2 : null;
                if (aVar2 != null) {
                    MainActivity mainActivity = (MainActivity) aVar2;
                    mainActivity.s(new EditLibraryComposePage(mainActivity));
                    p211v6.a aVar3 = mainActivity.f13639d0;
                    if (aVar3 == null) {
                        j.k("systemUiHelper");
                        throw null;
                    }
                    aVar3.d();
                }
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return j.h((Object[]) obj);
            case 17:
                p124m3.a aVar4 = (p124m3.a) obj;
                ((B) aVar4.f19538n).getClass();
                return aVar4.f19535k;
            case 18:
                return new O1.c((p168q6.d) obj);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                p197u2.d dVar = ((p173r2.j) obj).f21448y;
                if (!dVar.f22833i) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (dVar.j.f12672c != EnumC0767p.f12661r) {
                    return ((p197u2.c) C0532j.e(dVar.f22826a, (S) dVar.f22836m.getValue(), 4).a(p251z9.w.a(p197u2.c.class))).f22825b;
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
            case 20:
                p pVar = (p) obj;
                pVar.getClass();
                try {
                    pVar.f21708N.w(2, 0, false);
                    break;
                } catch (IOException e10) {
                    EnumC1290b enumC1290b = EnumC1290b.PROTOCOL_ERROR;
                    pVar.b(enumC1290b, enumC1290b, e10);
                }
                return yVar;
            case 21:
                List list = (List) ((L0) obj).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (j.a(((p173r2.j) obj2).f21442s.f21492r, "composable")) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 22:
                return new t((String) obj);
            case 23:
                p199u4.b bVar = (p199u4.b) obj;
                int i14 = p143o2.d.f20267e;
                int i15 = AudioAttributesCompat.f12692b;
                X4.c aVar5 = Build.VERSION.SDK_INT >= 26 ? new p143o2.a(27) : new X4.c(27);
                ((AudioAttributes.Builder) aVar5.f9953r).setContentType(2);
                aVar5.r();
                AudioAttributesImpl audioAttributesImplI = aVar5.i();
                AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
                audioAttributesCompat.f12693a = audioAttributesImplI;
                Handler handler = bVar.f22934a;
                if (handler != null) {
                    return new p143o2.d(bVar, handler, audioAttributesCompat);
                }
                throw new IllegalArgumentException("Handler must not be null");
            default:
                OnboardingActivity onboardingActivity = (OnboardingActivity) obj;
                int i16 = OnboardingActivity.T;
                onboardingActivity.startActivity(new Intent(onboardingActivity, Class.forName(onboardingActivity.S)));
                onboardingActivity.finish();
                return yVar;
        }
    }
}
