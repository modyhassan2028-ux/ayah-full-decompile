package io.realm.internal.coroutines;

import K9.AbstractC0405x;
import M9.r;
import M9.s;
import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import io.realm.CollectionUtils;
import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.ObjectChangeSet;
import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.RealmObjectChangeListener;
import io.realm.RealmResults;
import io.realm.coroutines.FlowFactory;
import io.realm.rx.CollectionChange;
import io.realm.rx.ObjectChange;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p110k9.y;
import p251z9.j;
import p251z9.k;
import q9.e;
import q9.i;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class InternalFlowFactory implements FlowFactory {
    private final boolean returnFrozenObjects;

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1, reason: invalid class name */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1", f = "InternalFlowFactory.kt", l = {166, 192}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p241y9.e {
        final /* synthetic */ RealmConfiguration $config;
        final /* synthetic */ RealmResults<T> $results;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00041 extends k implements p241y9.a {
            public static final C00041 INSTANCE = new C00041();

            public C00041() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m6invoke() {
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m6invoke();
                return y.f19095a;
            }
        }

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements p241y9.a {
            final /* synthetic */ Realm $flowRealm;
            final /* synthetic */ OrderedRealmCollectionChangeListener<RealmResults<T>> $listener;
            final /* synthetic */ RealmResults<T> $results;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Realm realm, RealmResults<T> realmResults, OrderedRealmCollectionChangeListener<RealmResults<T>> orderedRealmCollectionChangeListener) {
                super(0);
                this.$flowRealm = realm;
                this.$results = realmResults;
                this.$listener = orderedRealmCollectionChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m7invoke();
                return y.f19095a;
            }

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
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m7invoke() {
                if (this.$flowRealm.isClosed()) {
                    return;
                }
                this.$results.removeChangeListener((OrderedRealmCollectionChangeListener<RealmResults<T>>) this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RealmResults<T> realmResults, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$results = realmResults;
            this.$config = realmConfiguration;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m5invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, RealmResults realmResults, OrderedCollectionChangeSet orderedCollectionChangeSet) {
            if (AbstractC0405x.u(sVar)) {
                if (internalFlowFactory.returnFrozenObjects) {
                    ((r) sVar).k(new CollectionChange(realmResults.freeze(), orderedCollectionChangeSet));
                } else {
                    ((r) sVar).k(new CollectionChange(realmResults, orderedCollectionChangeSet));
                }
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$results, this.$config, this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((AnonymousClass1) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0082 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x0083 A[RETURN] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            y yVar = y.f19095a;
            if (i10 != 0) {
                if (i10 == 1) {
                    p110k9.a.e(obj);
                    return yVar;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            }
            p110k9.a.e(obj);
            s sVar = (s) this.L$0;
            boolean zIsValid = this.$results.isValid();
            p161p9.a aVar = p161p9.a.f21156r;
            if (!zIsValid) {
                C00041 c00041 = C00041.INSTANCE;
                this.label = 1;
                if (g.i(sVar, c00041, this) == aVar) {
                    return aVar;
                }
                return yVar;
            }
            Realm realm = Realm.getInstance(this.$config);
            a aVar2 = new a(sVar, this.this$0, 0);
            this.$results.addChangeListener(aVar2);
            if (this.this$0.returnFrozenObjects) {
                ((r) sVar).k(new CollectionChange(this.$results.freeze(), null));
            } else {
                ((r) sVar).k(new CollectionChange(this.$results, null));
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(realm, this.$results, aVar2);
            this.label = 2;
            if (g.i(sVar, anonymousClass2, this) == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2, reason: invalid class name */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2", f = "InternalFlowFactory.kt", l = {266, 292}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p241y9.e {
        final /* synthetic */ RealmConfiguration $config;
        final /* synthetic */ RealmResults<T> $results;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends k implements p241y9.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m9invoke() {
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m9invoke();
                return y.f19095a;
            }
        }

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C00052 extends k implements p241y9.a {
            final /* synthetic */ DynamicRealm $flowRealm;
            final /* synthetic */ OrderedRealmCollectionChangeListener<RealmResults<T>> $listener;
            final /* synthetic */ RealmResults<T> $results;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00052(DynamicRealm dynamicRealm, RealmResults<T> realmResults, OrderedRealmCollectionChangeListener<RealmResults<T>> orderedRealmCollectionChangeListener) {
                super(0);
                this.$flowRealm = dynamicRealm;
                this.$results = realmResults;
                this.$listener = orderedRealmCollectionChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m10invoke();
                return y.f19095a;
            }

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
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m10invoke() {
                if (this.$flowRealm.isClosed()) {
                    return;
                }
                this.$results.removeChangeListener((OrderedRealmCollectionChangeListener<RealmResults<T>>) this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RealmResults<T> realmResults, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$results = realmResults;
            this.$config = realmConfiguration;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m8invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, RealmResults realmResults, OrderedCollectionChangeSet orderedCollectionChangeSet) {
            if (AbstractC0405x.u(sVar)) {
                if (internalFlowFactory.returnFrozenObjects) {
                    ((r) sVar).k(new CollectionChange(realmResults.freeze(), orderedCollectionChangeSet));
                } else {
                    ((r) sVar).k(new CollectionChange(realmResults, orderedCollectionChangeSet));
                }
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$results, this.$config, this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((AnonymousClass2) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0082 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x0083 A[RETURN] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            y yVar = y.f19095a;
            if (i10 != 0) {
                if (i10 == 1) {
                    p110k9.a.e(obj);
                    return yVar;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            }
            p110k9.a.e(obj);
            s sVar = (s) this.L$0;
            boolean zIsValid = this.$results.isValid();
            p161p9.a aVar = p161p9.a.f21156r;
            if (!zIsValid) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.label = 1;
                if (g.i(sVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
                return yVar;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.$config);
            a aVar2 = new a(sVar, this.this$0, 1);
            this.$results.addChangeListener(aVar2);
            if (this.this$0.returnFrozenObjects) {
                ((r) sVar).k(new CollectionChange(this.$results.freeze(), null));
            } else {
                ((r) sVar).k(new CollectionChange(this.$results, null));
            }
            C00052 c00052 = new C00052(dynamicRealm, this.$results, aVar2);
            this.label = 2;
            if (g.i(sVar, c00052, this) == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3, reason: invalid class name */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3", f = "InternalFlowFactory.kt", l = {366, 394}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements p241y9.e {
        final /* synthetic */ RealmConfiguration $config;
        final /* synthetic */ RealmList<T> $list;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends k implements p241y9.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m12invoke() {
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m12invoke();
                return y.f19095a;
            }
        }

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements p241y9.a {
            final /* synthetic */ Realm $flowRealm;
            final /* synthetic */ RealmList<T> $list;
            final /* synthetic */ OrderedRealmCollectionChangeListener<RealmList<T>> $listener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Realm realm, RealmList<T> realmList, OrderedRealmCollectionChangeListener<RealmList<T>> orderedRealmCollectionChangeListener) {
                super(0);
                this.$flowRealm = realm;
                this.$list = realmList;
                this.$listener = orderedRealmCollectionChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13invoke();
                return y.f19095a;
            }

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
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m13invoke() {
                if (this.$flowRealm.isClosed()) {
                    return;
                }
                this.$list.removeChangeListener((OrderedRealmCollectionChangeListener<RealmList<T>>) this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RealmList<T> realmList, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$list = realmList;
            this.$config = realmConfiguration;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m11invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, RealmList realmList, OrderedCollectionChangeSet orderedCollectionChangeSet) {
            if (AbstractC0405x.u(sVar)) {
                if (!realmList.isValid()) {
                    ((r) sVar).j0(null);
                } else if (internalFlowFactory.returnFrozenObjects) {
                    ((r) sVar).k(new CollectionChange(realmList.freeze(), orderedCollectionChangeSet));
                } else {
                    ((r) sVar).k(new CollectionChange(realmList, orderedCollectionChangeSet));
                }
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$list, this.$config, this.this$0, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((AnonymousClass3) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0082 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x0083 A[RETURN] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            y yVar = y.f19095a;
            if (i10 != 0) {
                if (i10 == 1) {
                    p110k9.a.e(obj);
                    return yVar;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            }
            p110k9.a.e(obj);
            s sVar = (s) this.L$0;
            boolean zIsValid = this.$list.isValid();
            p161p9.a aVar = p161p9.a.f21156r;
            if (!zIsValid) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.label = 1;
                if (g.i(sVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
                return yVar;
            }
            Realm realm = Realm.getInstance(this.$config);
            a aVar2 = new a(sVar, this.this$0, 2);
            this.$list.addChangeListener(aVar2);
            if (this.this$0.returnFrozenObjects) {
                ((r) sVar).k(new CollectionChange(this.$list.freeze(), null));
            } else {
                ((r) sVar).k(new CollectionChange(this.$list, null));
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(realm, this.$list, aVar2);
            this.label = 2;
            if (g.i(sVar, anonymousClass2, this) == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4, reason: invalid class name */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4", f = "InternalFlowFactory.kt", l = {467, 495}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends i implements p241y9.e {
        final /* synthetic */ RealmConfiguration $config;
        final /* synthetic */ RealmList<T> $list;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends k implements p241y9.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m15invoke() {
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m15invoke();
                return y.f19095a;
            }
        }

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements p241y9.a {
            final /* synthetic */ DynamicRealm $flowRealm;
            final /* synthetic */ RealmList<T> $list;
            final /* synthetic */ OrderedRealmCollectionChangeListener<RealmList<T>> $listener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DynamicRealm dynamicRealm, RealmList<T> realmList, OrderedRealmCollectionChangeListener<RealmList<T>> orderedRealmCollectionChangeListener) {
                super(0);
                this.$flowRealm = dynamicRealm;
                this.$list = realmList;
                this.$listener = orderedRealmCollectionChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m16invoke();
                return y.f19095a;
            }

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
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m16invoke() {
                if (this.$flowRealm.isClosed()) {
                    return;
                }
                this.$list.removeChangeListener((OrderedRealmCollectionChangeListener<RealmList<T>>) this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RealmList<T> realmList, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$list = realmList;
            this.$config = realmConfiguration;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m14invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, RealmList realmList, OrderedCollectionChangeSet orderedCollectionChangeSet) {
            if (AbstractC0405x.u(sVar)) {
                if (!realmList.isValid()) {
                    ((r) sVar).j0(null);
                } else if (internalFlowFactory.returnFrozenObjects) {
                    ((r) sVar).k(new CollectionChange(realmList.freeze(), orderedCollectionChangeSet));
                } else {
                    ((r) sVar).k(new CollectionChange(realmList, orderedCollectionChangeSet));
                }
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$list, this.$config, this.this$0, cVar);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((AnonymousClass4) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0082 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x0083 A[RETURN] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            y yVar = y.f19095a;
            if (i10 != 0) {
                if (i10 == 1) {
                    p110k9.a.e(obj);
                    return yVar;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            }
            p110k9.a.e(obj);
            s sVar = (s) this.L$0;
            boolean zIsValid = this.$list.isValid();
            p161p9.a aVar = p161p9.a.f21156r;
            if (!zIsValid) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.label = 1;
                if (g.i(sVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
                return yVar;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.$config);
            a aVar2 = new a(sVar, this.this$0, 3);
            this.$list.addChangeListener(aVar2);
            if (this.this$0.returnFrozenObjects) {
                ((r) sVar).k(new CollectionChange(this.$list.freeze(), null));
            } else {
                ((r) sVar).k(new CollectionChange(this.$list, null));
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dynamicRealm, this.$list, aVar2);
            this.label = 2;
            if (g.i(sVar, anonymousClass2, this) == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5, reason: invalid class name */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5", f = "InternalFlowFactory.kt", l = {569, 597}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends i implements p241y9.e {
        final /* synthetic */ RealmConfiguration $config;
        final /* synthetic */ Realm $realm;

        /* JADX INFO: Incorrect field signature: TT; */
        final /* synthetic */ RealmModel $realmObject;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5$1, reason: invalid class name */
        public static final class AnonymousClass1 extends k implements p241y9.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m18invoke() {
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m18invoke();
                return y.f19095a;
            }
        }

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements p241y9.a {
            final /* synthetic */ Realm $flowRealm;
            final /* synthetic */ RealmObjectChangeListener<T> $listener;

            /* JADX INFO: Incorrect field signature: TT; */
            final /* synthetic */ RealmModel $realmObject;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (Lio/realm/Realm;TT;Lio/realm/RealmObjectChangeListener<TT;>;)V */
            public AnonymousClass2(Realm realm, RealmModel realmModel, RealmObjectChangeListener realmObjectChangeListener) {
                super(0);
                this.$flowRealm = realm;
                this.$realmObject = realmModel;
                this.$listener = realmObjectChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m19invoke();
                return y.f19095a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m19invoke() {
                if (this.$flowRealm.isClosed()) {
                    return;
                }
                RealmObject.removeChangeListener(this.$realmObject, this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lio/realm/Realm;Lio/realm/RealmConfiguration;TT;Lio/realm/internal/coroutines/InternalFlowFactory;Lo9/c;)V */
        public AnonymousClass5(Realm realm, RealmConfiguration realmConfiguration, RealmModel realmModel, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$realm = realm;
            this.$config = realmConfiguration;
            this.$realmObject = realmModel;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m17invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, RealmModel realmModel, ObjectChangeSet objectChangeSet) {
            if (AbstractC0405x.u(sVar)) {
                if (internalFlowFactory.returnFrozenObjects) {
                    ((r) sVar).k(new ObjectChange(RealmObject.freeze(realmModel), objectChangeSet));
                } else {
                    ((r) sVar).k(new ObjectChange(realmModel, objectChangeSet));
                }
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$realm, this.$config, this.$realmObject, this.this$0, cVar);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((AnonymousClass5) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x008a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x008b A[RETURN] */
        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            y yVar = y.f19095a;
            if (i10 != 0) {
                if (i10 == 1) {
                    p110k9.a.e(obj);
                    return yVar;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            }
            p110k9.a.e(obj);
            s sVar = (s) this.L$0;
            boolean zIsClosed = this.$realm.isClosed();
            p161p9.a aVar = p161p9.a.f21156r;
            if (zIsClosed) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.label = 1;
                if (g.i(sVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
                return yVar;
            }
            Realm realm = Realm.getInstance(this.$config);
            b bVar = new b(sVar, this.this$0, 0);
            RealmObject.addChangeListener(this.$realmObject, bVar);
            if (RealmObject.isLoaded(this.$realmObject)) {
                if (this.this$0.returnFrozenObjects) {
                    ((r) sVar).k(new ObjectChange(RealmObject.freeze(this.$realmObject), null));
                } else {
                    ((r) sVar).k(new ObjectChange(this.$realmObject, null));
                }
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(realm, this.$realmObject, bVar);
            this.label = 2;
            if (g.i(sVar, anonymousClass2, this) == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6, reason: invalid class name */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6", f = "InternalFlowFactory.kt", l = {674, 702}, m = "invokeSuspend")
    public static final class AnonymousClass6 extends i implements p241y9.e {
        final /* synthetic */ RealmConfiguration $config;
        final /* synthetic */ DynamicRealmObject $dynamicRealmObject;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6$1, reason: invalid class name */
        public static final class AnonymousClass1 extends k implements p241y9.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m21invoke() {
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m21invoke();
                return y.f19095a;
            }
        }

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements p241y9.a {
            final /* synthetic */ DynamicRealmObject $dynamicRealmObject;
            final /* synthetic */ Realm $flowRealm;
            final /* synthetic */ RealmObjectChangeListener<DynamicRealmObject> $listener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Realm realm, DynamicRealmObject dynamicRealmObject, RealmObjectChangeListener<DynamicRealmObject> realmObjectChangeListener) {
                super(0);
                this.$flowRealm = realm;
                this.$dynamicRealmObject = dynamicRealmObject;
                this.$listener = realmObjectChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22invoke();
                return y.f19095a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22invoke() {
                if (this.$flowRealm.isClosed()) {
                    return;
                }
                RealmObject.removeChangeListener(this.$dynamicRealmObject, this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(DynamicRealmObject dynamicRealmObject, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$dynamicRealmObject = dynamicRealmObject;
            this.$config = realmConfiguration;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m20invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, DynamicRealmObject dynamicRealmObject, ObjectChangeSet objectChangeSet) {
            if (AbstractC0405x.u(sVar)) {
                if (internalFlowFactory.returnFrozenObjects) {
                    ((r) sVar).k(new ObjectChange(RealmObject.freeze(dynamicRealmObject), objectChangeSet));
                } else {
                    ((r) sVar).k(new ObjectChange(dynamicRealmObject, objectChangeSet));
                }
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.$dynamicRealmObject, this.$config, this.this$0, cVar);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((AnonymousClass6) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x008a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x008b A[RETURN] */
        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            y yVar = y.f19095a;
            if (i10 != 0) {
                if (i10 == 1) {
                    p110k9.a.e(obj);
                    return yVar;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            }
            p110k9.a.e(obj);
            s sVar = (s) this.L$0;
            boolean zIsValid = RealmObject.isValid(this.$dynamicRealmObject);
            p161p9.a aVar = p161p9.a.f21156r;
            if (!zIsValid) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.label = 1;
                if (g.i(sVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
                return yVar;
            }
            Realm realm = Realm.getInstance(this.$config);
            b bVar = new b(sVar, this.this$0, 1);
            RealmObject.addChangeListener(this.$dynamicRealmObject, bVar);
            if (RealmObject.isLoaded(this.$dynamicRealmObject)) {
                if (this.this$0.returnFrozenObjects) {
                    ((r) sVar).k(new ObjectChange(RealmObject.freeze(this.$dynamicRealmObject), null));
                } else {
                    ((r) sVar).k(new ObjectChange(this.$dynamicRealmObject, null));
                }
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(realm, this.$dynamicRealmObject, bVar);
            this.label = 2;
            if (g.i(sVar, anonymousClass2, this) == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$1, reason: invalid class name and case insensitive filesystem */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$from$1", f = "InternalFlowFactory.kt", l = {64}, m = "invokeSuspend")
    public static final class C10391 extends i implements p241y9.e {
        final /* synthetic */ Realm $realm;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00061 extends k implements p241y9.a {
            final /* synthetic */ Realm $flowRealm;
            final /* synthetic */ RealmChangeListener<Realm> $listener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00061(Realm realm, RealmChangeListener<Realm> realmChangeListener) {
                super(0);
                this.$flowRealm = realm;
                this.$listener = realmChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m24invoke();
                return y.f19095a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m24invoke() {
                this.$flowRealm.removeChangeListener(this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10391(Realm realm, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$realm = realm;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m23invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, Realm realm, Realm realm2) {
            if (AbstractC0405x.u(sVar)) {
                if (!internalFlowFactory.returnFrozenObjects) {
                    ((r) sVar).k(realm2);
                    return;
                }
                Realm realmFreeze = realm.freeze();
                j.d(realmFreeze, "realm.freeze()");
                ((r) sVar).k(realmFreeze);
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            C10391 c10391 = new C10391(this.$realm, this.this$0, cVar);
            c10391.L$0 = obj;
            return c10391;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((C10391) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                p110k9.a.e(obj);
                s sVar = (s) this.L$0;
                Realm realm = Realm.getInstance(this.$realm.getConfiguration());
                c cVar = new c(sVar, this.this$0, this.$realm, 0);
                realm.addChangeListener(cVar);
                if (this.this$0.returnFrozenObjects) {
                    Realm realmFreeze = realm.freeze();
                    j.d(realmFreeze, "flowRealm.freeze()");
                    ((r) sVar).k(realmFreeze);
                } else {
                    ((r) sVar).k(realm);
                }
                C00061 c00061 = new C00061(realm, cVar);
                this.label = 1;
                Object objI = g.i(sVar, c00061, this);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objI == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
            }
            return y.f19095a;
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$2, reason: invalid class name and case insensitive filesystem */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$from$2", f = "InternalFlowFactory.kt", l = {97}, m = "invokeSuspend")
    public static final class C10402 extends i implements p241y9.e {
        final /* synthetic */ DynamicRealm $dynamicRealm;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends k implements p241y9.a {
            final /* synthetic */ DynamicRealm $flowRealm;
            final /* synthetic */ RealmChangeListener<DynamicRealm> $listener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DynamicRealm dynamicRealm, RealmChangeListener<DynamicRealm> realmChangeListener) {
                super(0);
                this.$flowRealm = dynamicRealm;
                this.$listener = realmChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m26invoke();
                return y.f19095a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m26invoke() {
                this.$flowRealm.removeChangeListener(this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10402(DynamicRealm dynamicRealm, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$dynamicRealm = dynamicRealm;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m25invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, DynamicRealm dynamicRealm, DynamicRealm dynamicRealm2) {
            if (AbstractC0405x.u(sVar)) {
                if (!internalFlowFactory.returnFrozenObjects) {
                    ((r) sVar).k(dynamicRealm2);
                    return;
                }
                DynamicRealm dynamicRealmFreeze = dynamicRealm.freeze();
                j.d(dynamicRealmFreeze, "dynamicRealm.freeze()");
                ((r) sVar).k(dynamicRealmFreeze);
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            C10402 c10402 = new C10402(this.$dynamicRealm, this.this$0, cVar);
            c10402.L$0 = obj;
            return c10402;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((C10402) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                p110k9.a.e(obj);
                s sVar = (s) this.L$0;
                DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.$dynamicRealm.getConfiguration());
                c cVar = new c(sVar, this.this$0, this.$dynamicRealm, 1);
                dynamicRealm.addChangeListener(cVar);
                if (this.this$0.returnFrozenObjects) {
                    DynamicRealm dynamicRealmFreeze = dynamicRealm.freeze();
                    j.d(dynamicRealmFreeze, "flowRealm.freeze()");
                    ((r) sVar).k(dynamicRealmFreeze);
                } else {
                    ((r) sVar).k(dynamicRealm);
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(dynamicRealm, cVar);
                this.label = 1;
                Object objI = g.i(sVar, anonymousClass1, this);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objI == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
            }
            return y.f19095a;
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$3, reason: invalid class name and case insensitive filesystem */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$from$3", f = "InternalFlowFactory.kt", l = {116, 142}, m = "invokeSuspend")
    public static final class C10413 extends i implements p241y9.e {
        final /* synthetic */ RealmConfiguration $config;
        final /* synthetic */ RealmResults<T> $results;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends k implements p241y9.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m28invoke() {
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m28invoke();
                return y.f19095a;
            }
        }

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$3$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements p241y9.a {
            final /* synthetic */ Realm $flowRealm;
            final /* synthetic */ RealmChangeListener<RealmResults<T>> $listener;
            final /* synthetic */ RealmResults<T> $results;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Realm realm, RealmResults<T> realmResults, RealmChangeListener<RealmResults<T>> realmChangeListener) {
                super(0);
                this.$flowRealm = realm;
                this.$results = realmResults;
                this.$listener = realmChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m29invoke();
                return y.f19095a;
            }

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
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m29invoke() {
                if (this.$flowRealm.isClosed()) {
                    return;
                }
                this.$results.removeChangeListener((RealmChangeListener<RealmResults<T>>) this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10413(RealmResults<T> realmResults, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$results = realmResults;
            this.$config = realmConfiguration;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m27invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, RealmResults realmResults) {
            if (AbstractC0405x.u(sVar)) {
                if (!internalFlowFactory.returnFrozenObjects) {
                    ((r) sVar).k(realmResults);
                    return;
                }
                RealmResults realmResultsFreeze = realmResults.freeze();
                j.d(realmResultsFreeze, "listenerResults.freeze()");
                ((r) sVar).k(realmResultsFreeze);
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            C10413 c10413 = new C10413(this.$results, this.$config, this.this$0, cVar);
            c10413.L$0 = obj;
            return c10413;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((C10413) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x007d A[RETURN] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            y yVar = y.f19095a;
            if (i10 != 0) {
                if (i10 == 1) {
                    p110k9.a.e(obj);
                    return yVar;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            }
            p110k9.a.e(obj);
            s sVar = (s) this.L$0;
            boolean zIsValid = this.$results.isValid();
            p161p9.a aVar = p161p9.a.f21156r;
            if (!zIsValid) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.label = 1;
                if (g.i(sVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
                return yVar;
            }
            Realm realm = Realm.getInstance(this.$config);
            d dVar = new d(sVar, this.this$0, 0);
            this.$results.addChangeListener(dVar);
            if (this.this$0.returnFrozenObjects) {
                RealmResults realmResultsFreeze = this.$results.freeze();
                j.d(realmResultsFreeze, "results.freeze()");
                ((r) sVar).k(realmResultsFreeze);
            } else {
                ((r) sVar).k(this.$results);
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(realm, this.$results, dVar);
            this.label = 2;
            if (g.i(sVar, anonymousClass2, this) == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$4, reason: invalid class name and case insensitive filesystem */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$from$4", f = "InternalFlowFactory.kt", l = {216, 242}, m = "invokeSuspend")
    public static final class C10424 extends i implements p241y9.e {
        final /* synthetic */ RealmConfiguration $config;
        final /* synthetic */ RealmResults<T> $results;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends k implements p241y9.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m31invoke() {
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m31invoke();
                return y.f19095a;
            }
        }

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$4$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements p241y9.a {
            final /* synthetic */ DynamicRealm $flowRealm;
            final /* synthetic */ RealmChangeListener<RealmResults<T>> $listener;
            final /* synthetic */ RealmResults<T> $results;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DynamicRealm dynamicRealm, RealmResults<T> realmResults, RealmChangeListener<RealmResults<T>> realmChangeListener) {
                super(0);
                this.$flowRealm = dynamicRealm;
                this.$results = realmResults;
                this.$listener = realmChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m32invoke();
                return y.f19095a;
            }

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
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m32invoke() {
                if (this.$flowRealm.isClosed()) {
                    return;
                }
                this.$results.removeChangeListener((RealmChangeListener<RealmResults<T>>) this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10424(RealmResults<T> realmResults, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$results = realmResults;
            this.$config = realmConfiguration;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m30invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, RealmResults realmResults) {
            if (AbstractC0405x.u(sVar)) {
                if (!internalFlowFactory.returnFrozenObjects) {
                    ((r) sVar).k(realmResults);
                    return;
                }
                RealmResults realmResultsFreeze = realmResults.freeze();
                j.d(realmResultsFreeze, "listenerResults.freeze()");
                ((r) sVar).k(realmResultsFreeze);
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            C10424 c10424 = new C10424(this.$results, this.$config, this.this$0, cVar);
            c10424.L$0 = obj;
            return c10424;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((C10424) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x007d A[RETURN] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            y yVar = y.f19095a;
            if (i10 != 0) {
                if (i10 == 1) {
                    p110k9.a.e(obj);
                    return yVar;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            }
            p110k9.a.e(obj);
            s sVar = (s) this.L$0;
            boolean zIsValid = this.$results.isValid();
            p161p9.a aVar = p161p9.a.f21156r;
            if (!zIsValid) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.label = 1;
                if (g.i(sVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
                return yVar;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.$config);
            d dVar = new d(sVar, this.this$0, 1);
            this.$results.addChangeListener(dVar);
            if (this.this$0.returnFrozenObjects) {
                RealmResults realmResultsFreeze = this.$results.freeze();
                j.d(realmResultsFreeze, "results.freeze()");
                ((r) sVar).k(realmResultsFreeze);
            } else {
                ((r) sVar).k(this.$results);
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dynamicRealm, this.$results, dVar);
            this.label = 2;
            if (g.i(sVar, anonymousClass2, this) == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$5, reason: invalid class name and case insensitive filesystem */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$from$5", f = "InternalFlowFactory.kt", l = {314, 342}, m = "invokeSuspend")
    public static final class C10435 extends i implements p241y9.e {
        final /* synthetic */ RealmConfiguration $config;
        final /* synthetic */ RealmList<T> $realmList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$5$1, reason: invalid class name */
        public static final class AnonymousClass1 extends k implements p241y9.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m34invoke() {
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34invoke();
                return y.f19095a;
            }
        }

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$5$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements p241y9.a {
            final /* synthetic */ Realm $flowRealm;
            final /* synthetic */ RealmChangeListener<RealmList<T>> $listener;
            final /* synthetic */ RealmList<T> $realmList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Realm realm, RealmList<T> realmList, RealmChangeListener<RealmList<T>> realmChangeListener) {
                super(0);
                this.$flowRealm = realm;
                this.$realmList = realmList;
                this.$listener = realmChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m35invoke();
                return y.f19095a;
            }

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
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m35invoke() {
                if (this.$flowRealm.isClosed()) {
                    return;
                }
                this.$realmList.removeChangeListener((RealmChangeListener<RealmList<T>>) this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10435(RealmList<T> realmList, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$realmList = realmList;
            this.$config = realmConfiguration;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m33invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, RealmList realmList) {
            if (AbstractC0405x.u(sVar)) {
                if (!realmList.isValid()) {
                    ((r) sVar).j0(null);
                } else {
                    if (!internalFlowFactory.returnFrozenObjects) {
                        ((r) sVar).k(realmList);
                        return;
                    }
                    RealmList realmListFreeze = realmList.freeze();
                    j.d(realmListFreeze, "listenerResults.freeze()");
                    ((r) sVar).k(realmListFreeze);
                }
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            C10435 c10435 = new C10435(this.$realmList, this.$config, this.this$0, cVar);
            c10435.L$0 = obj;
            return c10435;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((C10435) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x007d A[RETURN] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            y yVar = y.f19095a;
            if (i10 != 0) {
                if (i10 == 1) {
                    p110k9.a.e(obj);
                    return yVar;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            }
            p110k9.a.e(obj);
            s sVar = (s) this.L$0;
            boolean zIsValid = this.$realmList.isValid();
            p161p9.a aVar = p161p9.a.f21156r;
            if (!zIsValid) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.label = 1;
                if (g.i(sVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
                return yVar;
            }
            Realm realm = Realm.getInstance(this.$config);
            d dVar = new d(sVar, this.this$0, 2);
            this.$realmList.addChangeListener(dVar);
            if (this.this$0.returnFrozenObjects) {
                RealmList realmListFreeze = this.$realmList.freeze();
                j.d(realmListFreeze, "realmList.freeze()");
                ((r) sVar).k(realmListFreeze);
            } else {
                ((r) sVar).k(this.$realmList);
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(realm, this.$realmList, dVar);
            this.label = 2;
            if (g.i(sVar, anonymousClass2, this) == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$6, reason: invalid class name and case insensitive filesystem */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$from$6", f = "InternalFlowFactory.kt", l = {415, 443}, m = "invokeSuspend")
    public static final class C10446 extends i implements p241y9.e {
        final /* synthetic */ RealmConfiguration $config;
        final /* synthetic */ RealmList<T> $realmList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$6$1, reason: invalid class name */
        public static final class AnonymousClass1 extends k implements p241y9.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m37invoke() {
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m37invoke();
                return y.f19095a;
            }
        }

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$6$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements p241y9.a {
            final /* synthetic */ DynamicRealm $flowRealm;
            final /* synthetic */ RealmChangeListener<RealmList<T>> $listener;
            final /* synthetic */ RealmList<T> $realmList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DynamicRealm dynamicRealm, RealmList<T> realmList, RealmChangeListener<RealmList<T>> realmChangeListener) {
                super(0);
                this.$flowRealm = dynamicRealm;
                this.$realmList = realmList;
                this.$listener = realmChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m38invoke();
                return y.f19095a;
            }

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
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m38invoke() {
                if (this.$flowRealm.isClosed()) {
                    return;
                }
                this.$realmList.removeChangeListener((RealmChangeListener<RealmList<T>>) this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10446(RealmList<T> realmList, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$realmList = realmList;
            this.$config = realmConfiguration;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m36invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, RealmList realmList) {
            if (AbstractC0405x.u(sVar)) {
                if (!realmList.isValid()) {
                    ((r) sVar).j0(null);
                } else {
                    if (!internalFlowFactory.returnFrozenObjects) {
                        ((r) sVar).k(realmList);
                        return;
                    }
                    RealmList realmListFreeze = realmList.freeze();
                    j.d(realmListFreeze, "listenerResults.freeze()");
                    ((r) sVar).k(realmListFreeze);
                }
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            C10446 c10446 = new C10446(this.$realmList, this.$config, this.this$0, cVar);
            c10446.L$0 = obj;
            return c10446;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((C10446) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x007d A[RETURN] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            y yVar = y.f19095a;
            if (i10 != 0) {
                if (i10 == 1) {
                    p110k9.a.e(obj);
                    return yVar;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            }
            p110k9.a.e(obj);
            s sVar = (s) this.L$0;
            boolean zIsValid = this.$realmList.isValid();
            p161p9.a aVar = p161p9.a.f21156r;
            if (!zIsValid) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.label = 1;
                if (g.i(sVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
                return yVar;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.$config);
            d dVar = new d(sVar, this.this$0, 3);
            this.$realmList.addChangeListener(dVar);
            if (this.this$0.returnFrozenObjects) {
                RealmList realmListFreeze = this.$realmList.freeze();
                j.d(realmListFreeze, "realmList.freeze()");
                ((r) sVar).k(realmListFreeze);
            } else {
                ((r) sVar).k(this.$realmList);
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dynamicRealm, this.$realmList, dVar);
            this.label = 2;
            if (g.i(sVar, anonymousClass2, this) == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$7, reason: invalid class name */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$from$7", f = "InternalFlowFactory.kt", l = {517, 545}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends i implements p241y9.e {
        final /* synthetic */ RealmConfiguration $config;
        final /* synthetic */ Realm $realm;

        /* JADX INFO: Incorrect field signature: TT; */
        final /* synthetic */ RealmModel $realmObject;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$7$1, reason: invalid class name */
        public static final class AnonymousClass1 extends k implements p241y9.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m40invoke() {
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m40invoke();
                return y.f19095a;
            }
        }

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$7$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements p241y9.a {
            final /* synthetic */ Realm $flowRealm;
            final /* synthetic */ RealmChangeListener<T> $listener;

            /* JADX INFO: Incorrect field signature: TT; */
            final /* synthetic */ RealmModel $realmObject;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (Lio/realm/Realm;TT;Lio/realm/RealmChangeListener<TT;>;)V */
            public AnonymousClass2(Realm realm, RealmModel realmModel, RealmChangeListener realmChangeListener) {
                super(0);
                this.$flowRealm = realm;
                this.$realmObject = realmModel;
                this.$listener = realmChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m41invoke();
                return y.f19095a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m41invoke() {
                if (this.$flowRealm.isClosed()) {
                    return;
                }
                RealmObject.removeChangeListener(this.$realmObject, (RealmChangeListener<RealmModel>) this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lio/realm/Realm;Lio/realm/RealmConfiguration;TT;Lio/realm/internal/coroutines/InternalFlowFactory;Lo9/c;)V */
        public AnonymousClass7(Realm realm, RealmConfiguration realmConfiguration, RealmModel realmModel, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$realm = realm;
            this.$config = realmConfiguration;
            this.$realmObject = realmModel;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m39invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, RealmModel realmModel) {
            if (AbstractC0405x.u(sVar)) {
                if (!internalFlowFactory.returnFrozenObjects) {
                    ((r) sVar).k(realmModel);
                    return;
                }
                RealmModel realmModelFreeze = RealmObject.freeze(realmModel);
                if (realmModelFreeze == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of io.realm.internal.coroutines.InternalFlowFactory.from.<no name provided>.invokeSuspend$lambda-0");
                }
                ((r) sVar).k(realmModelFreeze);
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$realm, this.$config, this.$realmObject, this.this$0, cVar);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((AnonymousClass7) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0084 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0085 A[RETURN] */
        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            y yVar = y.f19095a;
            if (i10 != 0) {
                if (i10 == 1) {
                    p110k9.a.e(obj);
                    return yVar;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            }
            p110k9.a.e(obj);
            s sVar = (s) this.L$0;
            boolean zIsClosed = this.$realm.isClosed();
            p161p9.a aVar = p161p9.a.f21156r;
            if (zIsClosed) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.label = 1;
                if (g.i(sVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
                return yVar;
            }
            Realm realm = Realm.getInstance(this.$config);
            d dVar = new d(sVar, this.this$0, 4);
            RealmObject.addChangeListener(this.$realmObject, dVar);
            if (RealmObject.isLoaded(this.$realmObject)) {
                if (this.this$0.returnFrozenObjects) {
                    RealmModel realmModelFreeze = RealmObject.freeze(this.$realmObject);
                    j.d(realmModelFreeze, "freeze(realmObject)");
                    ((r) sVar).k(realmModelFreeze);
                } else {
                    ((r) sVar).k(this.$realmObject);
                }
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(realm, this.$realmObject, dVar);
            this.label = 2;
            if (g.i(sVar, anonymousClass2, this) == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$8, reason: invalid class name */
    @e(c = "io.realm.internal.coroutines.InternalFlowFactory$from$8", f = "InternalFlowFactory.kt", l = {622, 650}, m = "invokeSuspend")
    public static final class AnonymousClass8 extends i implements p241y9.e {
        final /* synthetic */ RealmConfiguration $config;
        final /* synthetic */ DynamicRealm $dynamicRealm;
        final /* synthetic */ DynamicRealmObject $dynamicRealmObject;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalFlowFactory this$0;

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$8$1, reason: invalid class name */
        public static final class AnonymousClass1 extends k implements p241y9.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m43invoke() {
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m43invoke();
                return y.f19095a;
            }
        }

        /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$8$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements p241y9.a {
            final /* synthetic */ DynamicRealmObject $dynamicRealmObject;
            final /* synthetic */ DynamicRealm $flowRealm;
            final /* synthetic */ RealmChangeListener<DynamicRealmObject> $listener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject, RealmChangeListener<DynamicRealmObject> realmChangeListener) {
                super(0);
                this.$flowRealm = dynamicRealm;
                this.$dynamicRealmObject = dynamicRealmObject;
                this.$listener = realmChangeListener;
            }

            @Override // p241y9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m44invoke();
                return y.f19095a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m44invoke() {
                if (this.$flowRealm.isClosed()) {
                    return;
                }
                this.$dynamicRealmObject.removeChangeListener(this.$listener);
                this.$flowRealm.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(DynamicRealm dynamicRealm, RealmConfiguration realmConfiguration, DynamicRealmObject dynamicRealmObject, InternalFlowFactory internalFlowFactory, p150o9.c cVar) {
            super(2, cVar);
            this.$dynamicRealm = dynamicRealm;
            this.$config = realmConfiguration;
            this.$dynamicRealmObject = dynamicRealmObject;
            this.this$0 = internalFlowFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m42invokeSuspend$lambda0(s sVar, InternalFlowFactory internalFlowFactory, DynamicRealmObject dynamicRealmObject) {
            if (AbstractC0405x.u(sVar)) {
                if (!internalFlowFactory.returnFrozenObjects) {
                    ((r) sVar).k(dynamicRealmObject);
                    return;
                }
                RealmModel realmModelFreeze = dynamicRealmObject.freeze();
                j.d(realmModelFreeze, "listenerObj.freeze()");
                ((r) sVar).k(realmModelFreeze);
            }
        }

        @Override // q9.a
        public final p150o9.c create(Object obj, p150o9.c cVar) {
            AnonymousClass8 anonymousClass8 = new AnonymousClass8(this.$dynamicRealm, this.$config, this.$dynamicRealmObject, this.this$0, cVar);
            anonymousClass8.L$0 = obj;
            return anonymousClass8;
        }

        @Override // p241y9.e
        public final Object invoke(s sVar, p150o9.c cVar) {
            return ((AnonymousClass8) create(sVar, cVar)).invokeSuspend(y.f19095a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0084 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0085 A[RETURN] */
        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            y yVar = y.f19095a;
            if (i10 != 0) {
                if (i10 == 1) {
                    p110k9.a.e(obj);
                    return yVar;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            }
            p110k9.a.e(obj);
            s sVar = (s) this.L$0;
            boolean zIsClosed = this.$dynamicRealm.isClosed();
            p161p9.a aVar = p161p9.a.f21156r;
            if (zIsClosed) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.label = 1;
                if (g.i(sVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
                return yVar;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.$config);
            d dVar = new d(sVar, this.this$0, 5);
            this.$dynamicRealmObject.addChangeListener(dVar);
            if (RealmObject.isLoaded(this.$dynamicRealmObject)) {
                if (this.this$0.returnFrozenObjects) {
                    RealmModel realmModelFreeze = RealmObject.freeze(this.$dynamicRealmObject);
                    j.d(realmModelFreeze, "freeze(dynamicRealmObject)");
                    ((r) sVar).k(realmModelFreeze);
                } else {
                    ((r) sVar).k(this.$dynamicRealmObject);
                }
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dynamicRealm, this.$dynamicRealmObject, dVar);
            this.label = 2;
            if (g.i(sVar, anonymousClass2, this) == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    public InternalFlowFactory() {
        this(false, 1, null);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h changesetFrom(Realm realm, RealmResults<T> realmResults) {
        j.e(realm, "realm");
        j.e(realmResults, "results");
        return realm.isFrozen() ? new C4.e(7, new CollectionChange(realmResults, null)) : AbstractC0419l.h(new AnonymousClass1(realmResults, realm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    public InterfaceC0415h from(Realm realm) {
        j.e(realm, "realm");
        return realm.isFrozen() ? new C4.e(7, realm) : AbstractC0419l.h(new C10391(realm, this, null));
    }

    public InternalFlowFactory(boolean z10) {
        this.returnFrozenObjects = z10;
    }

    public /* synthetic */ InternalFlowFactory(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @Override // io.realm.coroutines.FlowFactory
    public InterfaceC0415h from(DynamicRealm dynamicRealm) {
        j.e(dynamicRealm, "dynamicRealm");
        if (dynamicRealm.isFrozen()) {
            return new C4.e(7, dynamicRealm);
        }
        return AbstractC0419l.h(new C10402(dynamicRealm, this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h changesetFrom(DynamicRealm dynamicRealm, RealmResults<T> realmResults) {
        j.e(dynamicRealm, "dynamicRealm");
        j.e(realmResults, "results");
        if (dynamicRealm.isFrozen()) {
            return new C4.e(7, new CollectionChange(realmResults, null));
        }
        return AbstractC0419l.h(new AnonymousClass2(realmResults, dynamicRealm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h from(Realm realm, RealmResults<T> realmResults) {
        j.e(realm, "realm");
        j.e(realmResults, "results");
        if (realm.isFrozen()) {
            return new C4.e(7, realmResults);
        }
        return AbstractC0419l.h(new C10413(realmResults, realm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h changesetFrom(Realm realm, RealmList<T> realmList) {
        j.e(realm, "realm");
        j.e(realmList, CollectionUtils.LIST_TYPE);
        if (realm.isFrozen()) {
            return new C4.e(7, new CollectionChange(realmList, null));
        }
        return AbstractC0419l.h(new AnonymousClass3(realmList, realm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h from(DynamicRealm dynamicRealm, RealmResults<T> realmResults) {
        j.e(dynamicRealm, "dynamicRealm");
        j.e(realmResults, "results");
        if (dynamicRealm.isFrozen()) {
            return new C4.e(7, realmResults);
        }
        return AbstractC0419l.h(new C10424(realmResults, dynamicRealm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h from(Realm realm, RealmList<T> realmList) {
        j.e(realm, "realm");
        j.e(realmList, "realmList");
        if (realm.isFrozen()) {
            return new C4.e(7, realmList);
        }
        return AbstractC0419l.h(new C10435(realmList, realm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h changesetFrom(DynamicRealm dynamicRealm, RealmList<T> realmList) {
        j.e(dynamicRealm, "dynamicRealm");
        j.e(realmList, CollectionUtils.LIST_TYPE);
        if (dynamicRealm.isFrozen()) {
            return new C4.e(7, new CollectionChange(realmList, null));
        }
        return AbstractC0419l.h(new AnonymousClass4(realmList, dynamicRealm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h from(DynamicRealm dynamicRealm, RealmList<T> realmList) {
        j.e(dynamicRealm, "dynamicRealm");
        j.e(realmList, "realmList");
        if (dynamicRealm.isFrozen()) {
            return new C4.e(7, realmList);
        }
        return AbstractC0419l.h(new C10446(realmList, dynamicRealm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T extends RealmModel> InterfaceC0415h changesetFrom(Realm realm, T t2) {
        j.e(realm, "realm");
        j.e(t2, "realmObject");
        if (realm.isFrozen()) {
            return new C4.e(7, new ObjectChange(t2, null));
        }
        return AbstractC0419l.h(new AnonymousClass5(realm, realm.getConfiguration(), t2, this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T extends RealmModel> InterfaceC0415h from(Realm realm, T t2) {
        j.e(realm, "realm");
        j.e(t2, "realmObject");
        if (realm.isFrozen()) {
            return new C4.e(7, t2);
        }
        return AbstractC0419l.h(new AnonymousClass7(realm, realm.getConfiguration(), t2, this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    public InterfaceC0415h changesetFrom(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject) {
        j.e(dynamicRealm, "dynamicRealm");
        j.e(dynamicRealmObject, "dynamicRealmObject");
        if (dynamicRealm.isFrozen()) {
            return new C4.e(7, new ObjectChange(dynamicRealmObject, null));
        }
        return AbstractC0419l.h(new AnonymousClass6(dynamicRealmObject, dynamicRealm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    public InterfaceC0415h from(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject) {
        j.e(dynamicRealm, "dynamicRealm");
        j.e(dynamicRealmObject, "dynamicRealmObject");
        if (dynamicRealm.isFrozen()) {
            return new C4.e(7, dynamicRealmObject);
        }
        return AbstractC0419l.h(new AnonymousClass8(dynamicRealm, dynamicRealm.getConfiguration(), dynamicRealmObject, this, null));
    }
}
