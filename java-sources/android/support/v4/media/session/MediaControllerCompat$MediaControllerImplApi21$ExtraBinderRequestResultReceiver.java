package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference f11307r;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        d dVar;
        f fVar = (f) this.f11307r.get();
        if (fVar == null || bundle == null) {
            return;
        }
        synchronized (fVar.f11340b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = fVar.f11343e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i11 = l.g;
            Y2.d dVar2 = null;
            if (binder == null) {
                dVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.f11337f = binder;
                    dVar = cVar;
                } else {
                    dVar = (d) iInterfaceQueryLocalInterface;
                }
            }
            mediaSessionCompat$Token.b(dVar);
            MediaSessionCompat$Token mediaSessionCompat$Token2 = fVar.f11343e;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(Y2.a.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable("a");
                    if (!(parcelable instanceof ParcelImpl)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    dVar2 = ((ParcelImpl) parcelable).f12976r;
                }
            } catch (RuntimeException unused) {
            }
            mediaSessionCompat$Token2.c(dVar2);
            fVar.a();
        }
    }
}
