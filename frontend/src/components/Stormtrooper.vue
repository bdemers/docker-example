<template>
    <div class="trooper-panel"
         :style="{ backgroundImage: 'url(' + require('@/assets/stormtrooper_background_640.jpg') + ')' }">
        <h1>Stormtrooper: {{ trooper.name }}</h1>

        <div class="panel-body trooper-panel-body">
            <div class="text-right pull-right">
                <table  class="table trooper-table-font">
                    <tr>
                        <th>Class:</th>
                        <th>{{ trooper.type }}</th>
                    </tr>
                    <tr>
                        <th>Species:</th>
                        <th>{{ trooper.species }}</th>
                    </tr>
                    <tr>
                        <th>Planet of Origin:</th>
                        <th>{{ trooper.planetOfOrigin }}</th>
                    </tr>
                </table>
            </div>
        </div>

    </div>
</template>

<script lang="ts">
    import { Component, Vue } from 'vue-property-decorator';
    import { Stormtrooper, DefaultStormtrooper } from '../../trooper/Stormtrooper.model';
    import { StormtrooperService } from '../../trooper/Stormtrooper.service'

    @Component
    export default class SingleStormtrooper extends Vue {

        public trooper: Stormtrooper = new DefaultStormtrooper();
        private stormtrooperService = new StormtrooperService();

        private async created() {
            this.stormtrooperService.get(this.$route.params['name'])
                .then(res => {
                    if (res.data) {
                        this.trooper = res.data;
                    }
                });
        }
    }
</script>

<style scoped>
    .trooper-panel {
        height: 480px;
        width: 640px;
    }
</style>