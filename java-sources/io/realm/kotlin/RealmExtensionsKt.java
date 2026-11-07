package io.realm.kotlin;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import K9.U;
import N9.InterfaceC0415h;
import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.RealmQuery;
import io.realm.internal.async.RealmThreadPoolExecutor;
import p110k9.y;
import p150o9.h;
import p181s2.o;
import p251z9.j;
import q9.c;
import q9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class RealmExtensionsKt {

    /* JADX INFO: renamed from: io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1, reason: invalid class name */
    @e(c = "io.realm.kotlin.RealmExtensionsKt", f = "RealmExtensions.kt", l = {142}, m = "executeTransactionAwait")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(p150o9.c cVar) {
            super(cVar);
        }

        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealmExtensionsKt.executeTransactionAwait(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2, reason: invalid class name */
    @e(c = "io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2", f = "RealmExtensions.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p241y9.e {
        final /* synthetic */ Realm $this_executeTransactionAwait;
        final /* synthetic */ p241y9.c $transaction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Realm realm, p241y9.c cVar, p150o9.c cVar2) {
            super(2, cVar2);
            this.$this_executeTransactionAwait = realm;
            this.$transaction = cVar;
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_executeTransactionAwait, this.$transaction, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p241y9.e
        public final Object invoke(InterfaceC0402u interfaceC0402u, p150o9.c cVar) {
            return ((AnonymousClass2) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
        }

        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
            InterfaceC0402u interfaceC0402u = (InterfaceC0402u) this.L$0;
            Realm realm = Realm.getInstance(this.$this_executeTransactionAwait.getConfiguration());
            final p241y9.c cVar = this.$transaction;
            try {
                if (AbstractC0405x.u(interfaceC0402u)) {
                    realm.executeTransaction(new Realm.Transaction() { // from class: io.realm.kotlin.a
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm2) {
                            cVar.e(realm2);
                        }
                    });
                }
                o.e(realm, null);
                return y.f19095a;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    o.e(realm, th);
                    throw th2;
                }
            }
        }
    }

    public static final <T extends RealmModel> T createEmbeddedObject(Realm realm, RealmModel realmModel, String str) {
        j.e(realm, "<this>");
        j.e(realmModel, "parentObject");
        j.e(str, "parentProperty");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final <T extends RealmModel> T createObject(Realm realm) {
        j.e(realm, "<this>");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final <T extends RealmModel> void delete(Realm realm) {
        j.e(realm, "<this>");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object executeTransactionAwait(Realm realm, h hVar, p241y9.c cVar, p150o9.c cVar2) {
        AnonymousClass1 anonymousClass1;
        if (cVar2 instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar2;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar2);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar2);
        }
        Object obj = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            p110k9.a.e(obj);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(realm, cVar, null);
            anonymousClass1.L$0 = realm;
            anonymousClass1.label = 1;
            Object objI = AbstractC0405x.I(hVar, anonymousClass2, anonymousClass1);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            realm = (Realm) anonymousClass1.L$0;
            p110k9.a.e(obj);
        }
        realm.refresh();
        return y.f19095a;
    }

    public static Object executeTransactionAwait$default(Realm realm, h hVar, p241y9.c cVar, p150o9.c cVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            RealmThreadPoolExecutor realmThreadPoolExecutor = Realm.WRITE_EXECUTOR;
            j.d(realmThreadPoolExecutor, "WRITE_EXECUTOR");
            hVar = new U(realmThreadPoolExecutor);
        }
        return executeTransactionAwait(realm, hVar, cVar, cVar2);
    }

    public static final InterfaceC0415h toflow(Realm realm) {
        j.e(realm, "<this>");
        InterfaceC0415h interfaceC0415hFrom = realm.getConfiguration().getFlowFactory().from(realm);
        j.d(interfaceC0415hFrom, "configuration.flowFactory.from(this)");
        return interfaceC0415hFrom;
    }

    public static final <T extends RealmModel> RealmQuery<T> where(Realm realm) {
        j.e(realm, "<this>");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final <T extends RealmModel> T createObject(Realm realm, Object obj) {
        j.e(realm, "<this>");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
