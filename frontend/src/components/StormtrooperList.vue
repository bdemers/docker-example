<template>
    <div class="trooper-list">
        <h1>Stormtroopers</h1>

        <div class="panel panel-default">
            <table id="troopers" class="table table-striped table-bordered " cellspacing="0" width="20%">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>TYPE</th>
                    <th>DETAILS</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="trooper in troopers" v-bind:key="trooper.name">
                    <td>{{ trooper.name }}</td>
                    <td>{{ trooper.type }}</td>
                    <td>
                        <a v-bind:href="'/trooper/' + trooper.name">View</a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script lang="ts">
    import { Inject, Component, Vue } from 'vue-property-decorator';
    import { StormtrooperService } from '../../trooper/Stormtrooper.service'
    import { Stormtrooper } from '../../trooper/Stormtrooper.model';
    @Component
    export default class StormtrooperList extends Vue {
        public troopers: Stormtrooper[] = [];
        private stormtrooperService = new StormtrooperService();

        private async created() {

            this.stormtrooperService.list()
                .then(res => {
                    if (res.data) {
                        this.troopers = res.data._embedded.stormtroopers;
                    }
                });
        }
    }
</script>

<style scoped>

</style>